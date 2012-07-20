package pl.krajewski.euler.problems.implementations.problems051_060;

import java.util.List;
import java.util.Map;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.numbers.primes.PrimeNumbers;

public class Problem050 extends Problem<Integer> {

	@Override
	public Integer getCorrectProblemAnswer() {
		return 997651;
	}

	@Override
	protected Map<Parameters, Integer> getTestAnswers() {
		Map<Parameters, Integer> testAnswers = super.getTestAnswers();
		testAnswers.put(new Parameters(100), 41);
		testAnswers.put(new Parameters(1000), 953);
		return testAnswers;
	}

	@Override
	public Integer resolveProblem() {

		Integer limit = getParameterForNumber(0);

		List<Integer> primesBelowNumber = PrimeNumbers
				.getPrimesBelowNumberAtkinSieve(limit);

		Integer[] primesBelowNumberArray = new Integer[primesBelowNumber.size()];
		for (int i = 0; i < primesBelowNumber.size(); i++) {
			primesBelowNumberArray[i] = primesBelowNumber.get(i);
		}

		Boolean[] primes = new Boolean[limit + 1];
		for (int i = 0; i <= limit; i++) {
			primes[i] = primesBelowNumber.contains(i);
		}

		int firstSum, firstInd;
		int size = primesBelowNumber.size();

		for (int series = size / 3; series > 1; series--) {

			firstSum = 0;
			firstInd = 0;
			for (int i = 0; i < series; i++) {
				firstSum += primesBelowNumberArray[i];
			}

			try {
				if (primes[firstSum]) {
					return firstSum;
				}
			} catch (ArrayIndexOutOfBoundsException ex) {
				continue;
			}

			for (int i = series; i < size / 5; i++) {
				firstSum -= primesBelowNumberArray[firstInd++];
				firstSum += primesBelowNumberArray[i];
				try {
					if (primes[firstSum]) {
						return firstSum;
					}
				} catch (ArrayIndexOutOfBoundsException ex) {
					break;
				}
			}
		}

		return 0;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1000000);
	}

}
