package pl.krajewski.euler.problems.implementations.problems031_040;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.PrimeNumbers;
import pl.krajewski.euler.problems.utils.numbers.TruncatedNumbers;

public class Problem037 extends Problem<Integer> {

	private Integer numberOfTruncatedIndex = 0;

	@Override
	public Integer resolveProblem() {
		int numberOfTruncated = getParameterForNumber(numberOfTruncatedIndex);

		int sum = 0;

		Set<Integer> primes = new HashSet<Integer>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);

		int number = 11;

		while (numberOfTruncated > 0) {

			boolean add = true;

			for (Integer numberTruncated : TruncatedNumbers
					.getNumbersTruncatedFromLeftAndRight(number)) {
				if (primes.contains(numberTruncated)) {
					continue;
				}
				if (PrimeNumbers.isNumberPrime(numberTruncated)) {
					primes.add(numberTruncated);
					continue;
				}
				add = false;
				break;
			}

			if (add) {
				numberOfTruncated--;
				sum += number;
			}

			number += 2;
		}

		return sum;
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 748317;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(11);
	}

}
