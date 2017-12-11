package pl.com.simbit.euler.problems.implementations.problems051_060;

import java.util.Map;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.math.PrimeNumbers;

/**
 * @author mkrajewski
 */
public class Problem058 extends Problem<Integer> {

	@Override
	public Integer getCorrectProblemAnswer() {
		return 26241;
	}

	@Override
	protected Map<Parameters, Integer> getTestAnswers() {
		Map<Parameters, Integer> map = super.getTestAnswers();
		map.put(new Parameters(0.8), 3);
		map.put(new Parameters(0.6), 5);
		return map;
	}

	@Override
	public Integer resolveProblem() {

		Double treshold = getParameterForNumber(0);

		int i = 3;

		int iR, iLU, iLB;

		int sumPrimes = 0;
		int sumAll = 0;

		while (true) {

			sumAll = i * 2 - 1;

			int j = i - 1;
			iR = j * j - i + 2;
			iLU = iR + j;
			iLB = iLU + j;

			if (PrimeNumbers.isNumberPrime(iR)) {
				sumPrimes++;
			}
			if (PrimeNumbers.isNumberPrime(iLU)) {
				sumPrimes++;
			}
			if (PrimeNumbers.isNumberPrime(iLB)) {
				sumPrimes++;
			}

			if ((double) (sumPrimes) / (double) (sumAll) < treshold) {
				return i;
			}

			i += 2;
		}

	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(0.1);
	}

}
