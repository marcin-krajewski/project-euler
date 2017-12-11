package pl.com.simbit.euler.problems.implementations.problems001_010;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.problems.numbers.PowerOfSum;
import pl.com.simbit.utility.problems.numbers.SumOfPowers;

public class Problem006 extends Problem<Double> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1.0, 100.0);
	}

	@Override
	public Double resolveProblem() {
		Double min = getParameterForNumber(0);
		Double max = getParameterForNumber(1);

		return new PowerOfSum().getPowerOfSum(min, max) - new SumOfPowers().getSumOfPower(min, max);
	}

	@Override
	public Double getCorrectProblemAnswer() {
		return 25164150.0;
	}

}
