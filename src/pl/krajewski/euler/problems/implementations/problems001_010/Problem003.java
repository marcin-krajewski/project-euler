package pl.krajewski.euler.problems.implementations.problems001_010;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.PrimeFactor;

public class Problem003 extends Problem<Double> {

	private Integer numberToResearchIndex = 0;

	@Override
    protected Parameters getParametersForProblem() {
        return new Parameters(600851475143.0);
    }
	
	@Override
	public Double resolveProblem() {

		Double numberToResearch = getParameterForNumber(numberToResearchIndex);
		return PrimeFactor.getLargestPrimeFactorOfNumber(numberToResearch);
	}

    @Override
    public Double getCorrectProblemAnswer() {
        return 6857.0;
    }
}
