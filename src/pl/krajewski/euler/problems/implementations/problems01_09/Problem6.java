package pl.krajewski.euler.problems.implementations.problems01_09;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.PowerOfSum;
import pl.krajewski.euler.problems.utils.SumOfPowers;

public class Problem6 extends Problem<Double>{

	public Problem6(Parameters parameters) {
		super(parameters);
	}

	@Override
	public Double resolveProblem() {
		double min = getParameterForNumber(0);
		double max = getParameterForNumber(1);
		
		return new PowerOfSum().getPowerOfSum(min, max) - new SumOfPowers().getSumOfPower(min, max);
	}

}
