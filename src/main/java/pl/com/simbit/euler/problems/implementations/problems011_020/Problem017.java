package pl.com.simbit.euler.problems.implementations.problems011_020;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.problems.string.EnglishNumbersWordLength;

public class Problem017 extends Problem<Double> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1, 1000);
	}

	@Override
	public Double resolveProblem() {
		Integer start = getParameterForNumber(0);
		Integer end = getParameterForNumber(1);

		Double sum = 0.0;

		for (int i = start; i <= end; i++) {
			sum += EnglishNumbersWordLength.getNumberLen(i);
		}
		return sum;
	}

	@Override
	public Double getCorrectProblemAnswer() {
		return 21124.0;
	}
}
