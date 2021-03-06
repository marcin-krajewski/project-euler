package pl.com.simbit.euler.problems.implementations.problems001_010;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;

public class Problem009 extends Problem<Integer> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1000);
	}

	@Override
	public Integer resolveProblem() {

		Integer sum = getParameterForNumber(0);

		for (int i = 1; i <= sum - 2; i++) {
			for (int j = i + 1; j <= sum - 1; j++) {
				for (int k = j + 1; k <= sum; k++) {
					if (i + j + k != sum) {
						continue;
					}
					if (i * i + j * j != k * k) {
						continue;
					}
					return i * j * k;
				}
			}
		}

		return 0;
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 31875000;
	}

}
