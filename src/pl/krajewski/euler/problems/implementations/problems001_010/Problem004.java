package pl.krajewski.euler.problems.implementations.problems001_010;

import pl.krajewski.euler.problems.Problem;

public class Problem004 extends Problem<Integer> {

	private Integer maximumNumberOfDigitsIndex = 0;

	@Override
	public Integer resolveProblem() {
		int maximumNumberOfDigits = getParameterForNumber(maximumNumberOfDigitsIndex);

		int min = (int) Math.pow(10, maximumNumberOfDigits - 1);
		int max = (int) Math.pow(10, maximumNumberOfDigits);

		int largestPalindrome = 0;
		for (int i = min; i < max; i++) {
			for (int j = min; j < max; j++) {
				int numberToCheckIfIsPalindrome = i * j;
				
				if (isPalindrome(numberToCheckIfIsPalindrome)
						&& numberToCheckIfIsPalindrome > largestPalindrome) {
					largestPalindrome = numberToCheckIfIsPalindrome;
				}
			}
		}

		return largestPalindrome;
	}

	private boolean isPalindrome(int number) {
		String stringValueOfNumber = String.valueOf(number);
		if (stringValueOfNumber == null || stringValueOfNumber.trim().isEmpty()) {
			return false;
		}
		stringValueOfNumber = stringValueOfNumber.trim();
		int lengthOfString = stringValueOfNumber.length();
		int endIndex = getEndIndexForLen(lengthOfString);

		int lengthOfStringDecrementedWith1 = lengthOfString - 1;
		for (int i = 0; i < endIndex; i++) {
			char charFront = stringValueOfNumber.charAt(i);
			char charEnd = stringValueOfNumber.charAt(lengthOfStringDecrementedWith1 - i);

			if (charFront != charEnd) {
				return false;
			}
		}
		return true;
	}

	private int getEndIndexForLen(int length) {
		int endIndex = 0;
		if (length % 2 == 0) {
			endIndex = length / 2;
		}
		else {
			endIndex = length / 2 - 1;
		}
		return endIndex;
	}

}
