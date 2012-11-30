package pl.krajewski.euler.problems.implementations.problems051_060;

import java.util.HashSet;
import java.util.Set;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.numbers.NumberDigits;
import pl.krajewski.euler.problems.utils.string.StringAsNum;

public class Problem052 extends Problem<Long> {

	@Override
	public Long getCorrectProblemAnswer() {
		return 142857L;
	}

	@Override
	public Long resolveProblem() {

		long[] multiplyArray = new long[5];

		for (long i = 2;; i++) {
			multiplyArray[0] = i * 2;
			if (!NumberDigits.getInstance().checkIfNumberHasDifferentDigitsForLong(multiplyArray[0])) {
				continue;
			}
			multiplyArray[1] = i * 3;
			multiplyArray[2] = i * 4;
			multiplyArray[3] = i * 5;
			multiplyArray[4] = i * 6;
			for (int index = 0; index < 4; index++) {
				if (!numbersContainsTheSameDifferentDigits(multiplyArray[index], multiplyArray[index + 1])) {
					break;
				}
				if (index == 3) {
					return i;
				}
			}
		}
	}

	private boolean numbersContainsTheSameDifferentDigits(long number1, long number2) {
		int[] number1Digits = StringAsNum.getStringAsNumArray0IsLowerMaxIsHigher(number1 + "");
		boolean[] number1DigitsArray = new boolean[10];
		for (int digit : number1Digits) {
			number1DigitsArray[digit] = true;
		}
		int[] number2Digits = StringAsNum.getStringAsNumArray0IsLowerMaxIsHigher(number2 + "");
		for (int digit : number2Digits) {
			if (!number1DigitsArray[digit]) {
				return false;
			}
		}
		return true;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return null;
	}

}
