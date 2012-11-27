package pl.krajewski.euler.problems.implementations.problems041_050;

import java.util.Set;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.numbers.PandigitalNumbers;

public class Problem043 extends Problem<Long> {

	@Override
	public Long getCorrectProblemAnswer() {
		return 16695334890L;
	}

	@Override
	public Long resolveProblem() {
		Set<String> nums = PandigitalNumbers.getAllPandigitalNumbersForMax(9);

		int[] primesN = new int[] { 2, 3, 5, 7, 11, 13, 17 };

		long numbers = 0;
		for (String s : nums) {
			if (isStringInSolution(s, primesN)) {
				numbers += Long.parseLong(s);
			}
		}
		return numbers;
	}

	private boolean isStringInSolution(String s, int[] primesN) {
		for (int i = 1; i <= 7; i++) {
			if (Integer.parseInt(s.substring(i, i + 3)) % primesN[i - 1] != 0) {
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
