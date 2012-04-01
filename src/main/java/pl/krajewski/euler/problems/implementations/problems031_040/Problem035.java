package pl.krajewski.euler.problems.implementations.problems031_040;

import java.util.HashSet;
import java.util.Set;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.PrimeNumbers;

public class Problem035 extends Problem<Integer> {

	Integer maxNumberIndex = 0;

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1000000);
	}

	@Override
	public Integer resolveProblem() {

		Integer maxNumber = getParameterForNumber(maxNumberIndex);

		Set<Double> primesBelowNumber = PrimeNumbers.getPrimesBelowNumber(maxNumber);
		Set<Double> checked = new HashSet<Double>();

		for (Double number : primesBelowNumber) {

			if (checked.contains(number)) {
				continue;
			}

			Set<Double> circularNumbersForNumber = getCircularNumbersForNumber(number);
			if (primesBelowNumber.containsAll(circularNumbersForNumber)) {
				checked.addAll(circularNumbersForNumber);
			}
		}

		return checked.size();
	}

	private Set<Double> getCircularNumbersForNumber(double number) {
		Set<Double> numbers = new HashSet<Double>();

		int digits = 1;
		int temp = (int) number;
		while ((temp /= 10) > 0) {
			digits++;
		}

		double mod;
		double newVal = number;
		for (int i = 0; i < digits; i++) {
			mod = newVal % 10;
			newVal = (int) (newVal / 10.0);
			newVal += Math.pow(10, digits - 1) * mod;
			numbers.add(newVal);
		}

		return numbers;
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 55;
	}
}
