package pl.com.simbit.euler.problems.implementations.problems021_030;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.problems.math.FibonacciSequence;

public class Problem025 extends Problem<Integer> {

	private Integer numberOfDigitsIndex = 0;

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1000);
	}

	@Override
	public Integer resolveProblem() {
		Integer numberOfDigits = getParameterForNumber(numberOfDigitsIndex);
		return FibonacciSequence.getFirstTermOfFibonacciWithNumberOfDigits(numberOfDigits);
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 4782;
	}

}
