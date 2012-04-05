package pl.krajewski.euler.problems.implementations.problems011_020;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.string.StringAsNum;
import pl.krajewski.euler.problems.utils.string.StringPower;

public class Problem016 extends Problem<Integer> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(2, 1000);
	}

	@Override
	public Integer resolveProblem() {
		Integer number = getParameterForNumber(0);
		Integer powNumber = getParameterForNumber(1);

		int sum = 0;

		String stringPow = StringPower.getPowerForNumberBelow10(number, powNumber);
		int[] numbers = StringAsNum.getStringAsNumArray0IsLowerMaxIsHigher(stringPow);
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

		logger.info("STRING " + sum);
		return sum;
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 1366;
	}

}
