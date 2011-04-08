package pl.krajewski.euler.problems.implementations.problems001_010;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.numbers.PowerOfSum;
import pl.krajewski.euler.problems.utils.numbers.SumOfPowers;

public class Problem006 extends Problem<Double> {

    @Override
    protected Parameters getParametersForProblem() {
        return new Parameters(1.0, 100.0);
    }
    
	@Override
	public Double resolveProblem() {
		double min = getParameterForNumber(0);
		double max = getParameterForNumber(1);

		return new PowerOfSum().getPowerOfSum(min, max)
				- new SumOfPowers().getSumOfPower(min, max);
	}

    @Override
    public Double getCorrectProblemAnswer() {
        return 25164150.0;
    }

}
