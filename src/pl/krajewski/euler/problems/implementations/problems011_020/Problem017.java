package pl.krajewski.euler.problems.implementations.problems011_020;

import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.string.EnglishNumbersWordLength;

public class Problem017 extends Problem<Double> {

	@Override
	public Double resolveProblem() {
		int start = getParameterForNumber(0);
		int end = getParameterForNumber(1);

		Double sum = 0.0;

		for (int i = start; i <= end; i++) {
			sum += EnglishNumbersWordLength.getNumberLen(i);
		}
		return sum;
	}

}