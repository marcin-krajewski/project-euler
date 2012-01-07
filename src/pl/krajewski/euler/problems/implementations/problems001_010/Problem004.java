package pl.krajewski.euler.problems.implementations.problems001_010;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.numbers.PalindromNumbers;

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
