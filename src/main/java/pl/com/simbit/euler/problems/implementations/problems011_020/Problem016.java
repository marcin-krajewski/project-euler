package pl.com.simbit.euler.problems.implementations.problems011_020;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.string.StringAsNum;
import pl.com.simbit.utility.string.StringPower;

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
