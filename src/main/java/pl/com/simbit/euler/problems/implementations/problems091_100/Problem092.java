package pl.com.simbit.euler.problems.implementations.problems091_100;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;

public class Problem092 extends Problem<Integer> {

	@Override
	public Integer getCorrectProblemAnswer() {
		return 8581146;
	}

	@Override
	public Integer resolveProblem() {
		Integer countOfNumbers = getParameterForNumber(0);

		int[] paths = new int[countOfNumbers + 1];
		paths[1] = 1;
		paths[89] = 89;

		int sum = 0;
		for (int i = 1; i <= countOfNumbers; i++) {
			Integer integerWithPath = checkIntegerWithPath(i, paths);
			if (integerWithPath == 89) {
				sum++;
			}
		}
		return sum;
	}

	private Integer checkIntegerWithPath(Integer numberToCheck, int[] paths) {
		if (paths[numberToCheck] == 0) {
			paths[numberToCheck] = checkIntegerWithPath(sumOfDigitSquares(numberToCheck), paths);
		}
		return paths[numberToCheck];
	}

	private int sumOfDigitSquares(int input) {

		int result = 0;
		while (input > 0) {
			int digit = input % 10;
			result += digit * digit;
			input /= 10;
		}
		return result;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(10000000);
	}

}
