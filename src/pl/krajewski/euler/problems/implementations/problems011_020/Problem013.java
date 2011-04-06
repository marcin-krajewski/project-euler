package pl.krajewski.euler.problems.implementations.problems011_020;

import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.string.FileReader;
import pl.krajewski.euler.problems.utils.string.StringAsNum;

public class Problem013 extends Problem<String> {

	@Override
	public String resolveProblem() {

		String fileName = getParameterForNumber(0);
		int count = getParameterForNumber(1);

		String[] lines = FileReader.readProblemFileLines(fileName);

		String numberString = StringAsNum.sumStringNumbers(lines);
		StringBuilder sb = new StringBuilder();
		int[] tab = StringAsNum
				.getStringAsNumArray0IsHigherMaxIsLower(numberString);
		for (int i = 0; i < count; i++) {
			sb.append(tab[i]);
		}

		return sb.toString();
	}

}