package pl.krajewski.euler.problems.implementations.problems201_210;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;

public class Problem206 extends Problem<Long> {

	@Override
	public Long getCorrectProblemAnswer() {
		return 1389019170L;
	}

	@Override
	public Long resolveProblem() {
		long min = (long) Math.sqrt(1020304050607080900.0);
		long max = (long) Math.sqrt(1929394959697989990.0);

		while (min % 10 != 0) {
			min++;
		}

		int maxD = 9;
		for (long i = min; i < max; i += 10) {
			long pow = i * i;

			int mod;
			for (mod = maxD; mod >= 1; mod--) {
				pow = pow / 100;
				if (pow % 10 != mod) {
					break;
				}
			}
			if (mod == 0) {
				return i;
			}
		}
		return null;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return null;
	}

}
