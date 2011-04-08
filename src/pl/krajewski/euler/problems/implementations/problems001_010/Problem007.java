package pl.krajewski.euler.problems.implementations.problems001_010;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.PrimeNumbers;

public class Problem007 extends Problem<Double> {

    @Override
    protected Parameters getParametersForProblem() {
        return new Parameters(10001);
    }
    
	@Override
	public Double resolveProblem() {
		int index = getParameterForNumber(0);
		return PrimeNumbers.getPrimeNumberForIndex(index);
	}

    @Override
    public Double getCorrectProblemAnswer() {
        return 104743.0;
    }

}
