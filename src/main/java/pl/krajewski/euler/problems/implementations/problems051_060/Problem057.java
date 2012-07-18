package pl.krajewski.euler.problems.implementations.problems051_060;

import java.util.Map;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.string.StringAsNum;

public class Problem057 extends Problem<Integer> {

	@Override
	public Integer getCorrectProblemAnswer() {
		return 153;
	}

	@Override
	public Integer resolveProblem() {
		Integer iterations = getParameterForNumber(0);

		int sum = 0;

		String num = "3";
		String den = "2";

		String tmpNum, tmpDen;

		for (int i = 1; i < iterations; i++) {
			tmpDen = StringAsNum.sumStringNumbers(num, den);
			tmpNum = StringAsNum.sumStringNumbers(tmpDen, den);

			den = tmpDen;
			num = tmpNum;

			if (num.length() > den.length()) {
				sum++;
			}
		}

		return sum;
	}

	@Override
	protected Map<Parameters, Integer> getTestAnswers() {
		Map<Parameters, Integer> testAnswers = super.getTestAnswers();
		testAnswers.put(new Parameters(8), 1);
		return testAnswers;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1000);
	}

}
