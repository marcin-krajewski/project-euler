package pl.krajewski.euler.problems.implementations.problems041_050;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.PrimeNumbers;

public class Problem041 extends Problem<Integer> {

	@Override
	public Integer getCorrectProblemAnswer() {
		return 7652413;
	}

	@Override
	public Integer resolveProblem() {
		int start = 7654321;// suma 1-9 jest 45, suma 1-8 jest 36. więc
							// podzielne przez 3
		for (int number = start;; number -= 2) {
			if (number % 5 == 0) {
				continue;
			}
			if (isNumStringFromMinToMaxDigits(1, 7, number + "")
					&& PrimeNumbers.isNumberPrime(number)) {
				return number;
			}
		}
	}

	private boolean isNumStringFromMinToMaxDigits(int min, int max,
			String numString) {

		int result = max - min + 1;
		if (numString.length() != result) {
			return false;
		}
		for (int i = min; i <= max; i++) {
			if (!numString.contains(i + "")) {
				return false;
			}
		}
		return true;
	}

	@Override
	protected Parameters getParametersForProblem() {
		// TODO Auto-generated method stub
		return null;
	}

}
