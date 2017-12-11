package pl.com.simbit.euler.problems.implementations.problems051_060;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.numbers.BinomialCoefficient;

public class Problem053 extends Problem<Integer> {

	@Override
	public Integer getCorrectProblemAnswer() {
		return 4075;
	}

	@Override
	public Integer resolveProblem() {
		Integer max = getParameterForNumber(0);
		Integer min = getParameterForNumber(1);

		int result = 0;
		for (int n = min; n <= max; n++) {
			for (int k = 1; k <= n; k++) {
				if (BinomialCoefficient.isBinomialCoefficientGreaterThan(n, k, 1000000)) {
					result++;
				}
			}
		}
		return result;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(100, 23);
	}

}
