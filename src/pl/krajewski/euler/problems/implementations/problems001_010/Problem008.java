package pl.krajewski.euler.problems.implementations.problems001_010;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.string.FileReader;

public class Problem008 extends Problem<Integer> {

	@Override
	public Integer resolveProblem() {
		String fileName = getParameterForNumber(0);
		int consecutiveDigits = getParameterForNumber(1);

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

}
