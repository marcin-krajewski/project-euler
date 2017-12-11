package pl.com.simbit.euler.problems.implementations.problems031_040;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.string.ConcatenateIntegers;

public class Problem040 extends Problem<Integer> {

	private final Integer indexesIndex = 0;
	private final Integer maxIndexIndex = 1;

	@Override
	public Integer resolveProblem() {
		int[] indexes = getParameterForNumber(indexesIndex);
		Integer maxIndex = getParameterForNumber(maxIndexIndex);
		return ConcatenateIntegers.getProductedIntegers(indexes, maxIndex);
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Parameters getParametersForProblem() {
		// TODO Auto-generated method stub
		return new Parameters(new int[] { 1, 10, 100, 1000, 10000, 100000, 1000000 }, 1000000);
	}

}
