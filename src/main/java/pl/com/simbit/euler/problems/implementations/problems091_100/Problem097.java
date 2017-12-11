package pl.com.simbit.euler.problems.implementations.problems091_100;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.problems.math.Power;

public class Problem097 extends Problem<Long> {

	@Override
	public Long getCorrectProblemAnswer() {
		return 8739992577L;
	}

	@Override
	public Long resolveProblem() {
		int mul = 28433;
		int a = 2;
		int pow = 7830457;
		long result = Power.powerForLastDigits(a, pow, 10);
		result *= mul;
		result++;

		return result % 10000000000L;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return null;
	}

}
