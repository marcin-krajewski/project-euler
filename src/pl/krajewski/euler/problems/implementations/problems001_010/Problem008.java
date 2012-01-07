package pl.krajewski.euler.problems.implementations.problems001_010;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.string.FileReader;

public class Problem008 extends Problem<Integer> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters("problem08.txt", 5);
	}

	@Override
	public Integer resolveProblem() {
		String fileName = getParameterForNumber(0);
		Integer consecutiveDigits = getParameterForNumber(1);

		Integer result = 0;

		String number = FileReader.readProblemFileInOneLine(fileName).trim();
		int res = 1;
		int len = number.length();
		for (int i = 0; i <= len - consecutiveDigits; i++, res = 1) {
			for (int j = i; j < i + consecutiveDigits; j++) {
				res *= Integer.parseInt(number.substring(j, j + 1));
			}
			if (res > result) {
				result = res;
			}
		}

		return result;
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 40824;
	}

}
