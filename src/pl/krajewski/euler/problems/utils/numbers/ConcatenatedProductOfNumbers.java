package pl.krajewski.euler.problems.utils.numbers;

import pl.krajewski.euler.problems.utils.classes.ArrayUtils;

public class ConcatenatedProductOfNumbers {

	public static Boolean checkIfNumberHasDifferentDigits(int number) {

		Boolean[] numbers = ArrayUtils.createArrayWithSizeAndValue(10, false,
				Boolean.class);

		int temp = number;
		int mod = 0;

		while (temp > 0) {
			mod = temp % 10;
			if (numbers[mod]) {
				return false;
			}
			numbers[mod] = true;
			temp /= 10;
		}

		return true;
	}

	public static Boolean checkIfNumberHasDifferentDigitsAndNotContains0(
			int number) {

		if (number <= 0) {
			return false;
		}

		Boolean[] numbers = ArrayUtils.createArrayWithSizeAndValue(10, false,
				Boolean.class);

		int temp = number;
		int mod = 0;

		while (temp > 0) {
			mod = temp % 10;
			if (mod == 0) {
				return false;
			}

			if (numbers[mod]) {
				return false;
			}
			numbers[mod] = true;
			temp /= 10;
		}

		return true;
	}
}
