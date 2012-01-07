package pl.krajewski.euler.problems.implementations.problems011_020;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.string.FileReader;
import pl.krajewski.euler.problems.utils.string.StringAsNum;

public class Problem013 extends Problem<String> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters("problem13.txt", 10, 50);
	}

	@Override
	public String resolveProblem() {

		String fileName = getParameterForNumber(0);
		Integer count = getParameterForNumber(1);

		String[] lines = FileReader.readProblemFileLines(fileName);

		String numberString = StringAsNum.sumStringNumbers(lines);
		StringBuilder sb = new StringBuilder();
		int[] tab = StringAsNum.getStringAsNumArray0IsHigherMaxIsLower(numberString);
		for (int i = 0; i < count; i++) {
			sb.append(tab[i]);
		}

		return sb.toString();
	}

	@Override
	public String getCorrectProblemAnswer() {
		return "5537376230";
	}

}
