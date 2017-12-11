package pl.com.simbit.euler.problems.implementations.problems001_010;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.problems.numbers.PalindromNumbers;

public class Problem004 extends Problem<Integer> {

	private final Integer maximumNumberOfDigitsIndex = 0;

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(3);
	}

	@Override
	public Integer resolveProblem() {
		Integer maximumNumberOfDigits = getParameterForNumber(maximumNumberOfDigitsIndex);

		int min = (int) Math.pow(10, maximumNumberOfDigits - 1);
		int max = (int) Math.pow(10, maximumNumberOfDigits);

		int largestPalindrome = 0;
		for (int i = min; i < max; i++) {
			for (int j = min; j < max; j++) {
				int numberToCheckIfIsPalindrome = i * j;

				if (PalindromNumbers.isNumberPalindrome(numberToCheckIfIsPalindrome)
						&& (numberToCheckIfIsPalindrome > largestPalindrome)) {
					largestPalindrome = numberToCheckIfIsPalindrome;
				}
			}
		}

		return largestPalindrome;
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 906609;
	}

}
