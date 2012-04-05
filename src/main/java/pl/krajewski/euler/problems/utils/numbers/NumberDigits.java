package pl.krajewski.euler.problems.utils.numbers;

import pl.krajewski.euler.problems.utils.classes.ArrayUtils;

public class NumberDigits {
	
	private static NumberDigits instance;

	private NumberDigits() {
	}

	public static synchronized NumberDigits getInstance() {
		if (instance == null) {
			instance = new NumberDigits();
		}
		return instance;
	}

	public Boolean checkIfNumberHasDifferentDigits(int number) {

		boolean[] numbers = new boolean[10];

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

	public Boolean checkIfNumberHasDifferentDigitsForLong(long number) {
		
		boolean[] numbers = new boolean[10];
		
		long temp = number;
		int mod = 0;
		
		while (temp > 0) {
			mod = (int) (temp % 10);
			if (numbers[mod]) {
				return false;
			}
			numbers[mod] = true;
			temp /= 10;
		}
		
		return true;
	}

	public Boolean checkIfNumberHasDifferentDigitsAndNotContains0(int number) {

		if (number <= 0) {
			return false;
		}

		Boolean[] numbers = ArrayUtils.createArrayWithSizeAndValue(10, false, Boolean.class);

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
