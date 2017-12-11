package pl.com.simbit.euler.problems.implementations.problems001_010;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.math.PrimeNumbers;

public class Problem007 extends Problem<Double> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(10001);
	}

	@Override
	public Double resolveProblem() {
		Integer index = getParameterForNumber(0);
		return PrimeNumbers.getPrimeNumberForIndex(index);
	}

	@Override
	public Double getCorrectProblemAnswer() {
		return 104743.0;
	}

}
