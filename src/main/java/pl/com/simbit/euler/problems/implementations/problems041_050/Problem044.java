package pl.com.simbit.euler.problems.implementations.problems041_050;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;

public class Problem044 extends Problem<Long> {

	@Override
	public Long getCorrectProblemAnswer() {
		return 5482660L;
	}

	@Override
	public Long resolveProblem() {
		long d1, d2;
		long aa3, bb3;
		double s1, s2;
		double s3, s4;
		int min = Integer.MAX_VALUE;
		for (int a = 1; a < 2200; a++) {
			aa3 = 3 * a * a;
			for (int b = a + 1; b < 2200; b++) {
				bb3 = b * b * 3;
				d1 = 1 - 12 * (a + b - aa3 - bb3);
				double sqrt = Math.sqrt(d1);
				d2 = 1 - 12 * (b - a + aa3 - bb3);
				double sqrt2 = Math.sqrt(d2);
				if (d1 >= 0 && sqrt == Math.floor(sqrt) && d2 >= 0 && sqrt2 == Math.floor(sqrt2)) {

					s1 = (1 - sqrt) / 6;
					s3 = (1 - sqrt2) / 6;

					if (hasCorrectAnswers(s1, s3)) {
						min = min(s3, min);
					}

					s4 = (1 + sqrt2) / 6;
					if (hasCorrectAnswers(s1, s4)) {
						min = min(s4, min);
					}

					s2 = (1 + sqrt) / 6;
					if (hasCorrectAnswers(s2, s3)) {
						min = min(s3, min);
					}
					if (hasCorrectAnswers(s2, s4)) {
						min = min(s4, min);
					}

				}
			}
		}
		logger.info("MIN {}", min);
		return (long) (min * (3 * min - 1) / 2);
	}

	private boolean hasCorrectAnswers(double x1, double x2) {
		return x1 > 0 && x2 > 0 && x1 == Math.floor(x1) && x2 == Math.floor(x2);
	}

	private int min(double value, int min) {
		return (int) Math.min(value, min);
	}

	@Override
	protected Parameters getParametersForProblem() {
		return null;
	}

}
