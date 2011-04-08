package pl.krajewski.euler.problems.implementations.problems001_010;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;

public class Problem002 extends Problem<Integer> {

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
	
	@Override
	protected Parameters getParametersForProblem() {
	    return new Parameters(4000000);
	}

    @Override
    public Integer getCorrectProblemAnswer() {
        return 4613732;
    }

}
