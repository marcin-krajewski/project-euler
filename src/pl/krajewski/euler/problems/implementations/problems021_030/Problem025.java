package pl.krajewski.euler.problems.implementations.problems021_030;

import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.FibonacciSequence;

public class Problem025 extends Problem<Integer> {

	private Integer numberOfDigitsIndex = 0;

	@Override
	public Integer resolveProblem() {
		Integer numberOfDigits = getParameterForNumber(numberOfDigitsIndex);
		return FibonacciSequence.getFirstTermOfFibonacciWithNumberOfDigits(numberOfDigits);
	}

}
