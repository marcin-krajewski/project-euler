package pl.krajewski.euler.problems.implementations.problems021_030;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.FibonacciSequence;

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
