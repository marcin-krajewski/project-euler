package pl.krajewski.euler.problems.implementations.problems051_060;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.string.StringAsNum;
import pl.krajewski.euler.problems.utils.string.StringPower;

public class Problem056 extends Problem<Integer> {

	@Override
	public Integer getCorrectProblemAnswer() {
		return null;
	}

	@Override
	public Integer resolveProblem() {
		Integer maxA = getParameterForNumber(0);
		Integer maxB = getParameterForNumber(1);
		int max = 0;
		for(int a = 1; a < maxA; a++) {
			for(int b = 1; b < maxB; b++) {
				String power = StringPower.getPowerForNumberBelow10(a, b);
				int[] digits = StringAsNum.getStringAsNumArray0IsLowerMaxIsHigher(power);
				int sum = 0;
				for(int digit : digits) {
					sum += digit;
				}
				if(sum >  max) {
					//logger.info("A: " + a + ", B: " + b + ", P: " + power);
					max = sum;
				}
			}
		}
		return max;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(100, 100);
	}

}
