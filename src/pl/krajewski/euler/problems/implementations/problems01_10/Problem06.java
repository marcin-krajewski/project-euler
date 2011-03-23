package pl.krajewski.euler.problems.implementations.problems01_10;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.PowerOfSum;
import pl.krajewski.euler.problems.utils.SumOfPowers;

public class Problem06 extends Problem<Double>{

	@Override
	public Double resolveProblem() {
		double min = getParameterForNumber(0);
		double max = getParameterForNumber(1);
		
		return new PowerOfSum().getPowerOfSum(min, max) - new SumOfPowers().getSumOfPower(min, max);
	}

}
