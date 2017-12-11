package pl.com.simbit.euler.problems.implementations.problems001_010;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.math.PrimeFactor;

public class Problem003 extends Problem<Double> {

	private final Integer numberToResearchIndex = 0;

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
