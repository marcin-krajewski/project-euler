package pl.krajewski.euler.problems.implementations.problems001_010;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.numbers.PowerOfSum;
import pl.krajewski.euler.problems.utils.numbers.SumOfPowers;

public class Problem06 extends Problem<Double> {

	@Override
	public Double resolveProblem() {
		double min = getParameterForNumber(0);
		double max = getParameterForNumber(1);

		return new PowerOfSum().getPowerOfSum(min, max)
				- new SumOfPowers().getSumOfPower(min, max);
	}

}
