package pl.krajewski.euler.problems.implementations.problems031_040;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.PrimeNumbers;
import pl.krajewski.euler.problems.utils.numbers.primes.EratosthenesSieve;

public class Problem035 extends Problem<Integer> {

	Integer maxNumberIndex = 0;

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1000000);
	}

	@Override
	public Integer resolveProblem() {

		Integer maxNumber = getParameterForNumber(maxNumberIndex);

		boolean[] primesBelowNumber = new EratosthenesSieve().getPrimeFlagsBelowNumber(maxNumber);
		Set<Integer> checked = new HashSet<Integer>();

		for (int number = 1; number < primesBelowNumber.length; number++) {

			if (!primesBelowNumber[number]) {
				continue;
			}

			if (checked.contains(number)) {
				continue;
			}

			Set<Integer> circularNumbersForNumber = getCircularNumbersForNumber(number);
			boolean not = false;
			for (int i : circularNumbersForNumber) {
				if (!primesBelowNumber[i]) {
					not = true;
				}
			}

			if (!not) {
				checked.addAll(circularNumbersForNumber);
			}
		}

		return checked.size();
	}

	private Set<Integer> getCircularNumbersForNumber(int number) {
		Set<Integer> numbers = new HashSet<Integer>();

		String n = number + "";
		for (int i = 0; i < n.length(); i++) {
			n = n.substring(1) + n.substring(0, 1);
			numbers.add(Integer.parseInt(n));
		}

		return numbers;
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 55;
	}
}
