package pl.krajewski.euler.problems.implementations.problems01_10;

import pl.krajewski.euler.problems.Problem;

public class Problem02 extends Problem<Integer> {

	private Integer maximumFibonacciValueIndex = 0;

	@Override
	public Integer resolveProblem() {

		Integer maximumFibonacciValue = this
				.getParameterForNumber(maximumFibonacciValueIndex);

		Integer sumOfEvenOddNumbers = 0;

		int currentNumber = 1;
		int previousNumber = 1;
		int tempVariable;
		while (currentNumber < maximumFibonacciValue) {
			if (currentNumber % 2 == 0) {
				sumOfEvenOddNumbers += currentNumber;
			}
			tempVariable = currentNumber;
			currentNumber += previousNumber;
			previousNumber = tempVariable;
		}

		return sumOfEvenOddNumbers;
	}

}
