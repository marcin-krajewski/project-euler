package pl.com.simbit.euler.problems.implementations.problems031_040;

import java.util.HashSet;
import java.util.Set;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.math.PrimeNumbers;
import pl.com.simbit.utility.numbers.TruncatedNumbers;

public class Problem037 extends Problem<Integer> {

	private final Integer numberOfTruncatedIndex = 0;

	@Override
	public Integer resolveProblem() {
		Integer numberOfTruncated = getParameterForNumber(numberOfTruncatedIndex);

		int sum = 0;

		Set<Integer> primes = new HashSet<Integer>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);

		int number = 11;

		while (numberOfTruncated > 0) {

			boolean add = true;

			for (Integer numberTruncated : TruncatedNumbers.getNumbersTruncatedFromLeftAndRight(number)) {
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
