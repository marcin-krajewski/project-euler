package pl.com.simbit.euler.problems.implementations.problems011_020;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.math.Divisors;

public class Problem012 extends Problem<Double> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(500);
	}

	@Override
	public Double resolveProblem() {
		Integer divisorsCount = getParameterForNumber(0);

		Double level = 1.0;
		double value = 1.0;
		while (true) {
			int divisors = Divisors.getCountOfDivisorsForNumber(value);
			if (divisors > divisorsCount) {
				return value;
			}
			level++;
			value += level;
		}
	}

	@Override
	public Double getCorrectProblemAnswer() {
		return 76576500.0;
	}

}
