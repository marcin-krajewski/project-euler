package pl.krajewski.euler.problems.implementations.problems21_30;

import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.FibonacciSequence;

public class Problem25 extends Problem<Integer> {

	private Integer numberOfDigitsIndex = 0;

	@Override
	public Integer resolveProblem() {
		Integer numberOfDigits = getParameterForNumber(numberOfDigitsIndex);
		return FibonacciSequence.getFirstTermOfFibonacciWithNumberOfDigits(numberOfDigits);
	}

}
