package pl.com.simbit.euler.problems.implementations.problems021_030;

import java.util.HashSet;
import java.util.Set;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.string.StringAsNum;
import pl.com.simbit.utility.string.StringPower;

public class Problem029 extends Problem<Integer> {

	private final Integer minAIndex = 0;
	private final Integer maxAIndex = 1;
	private final Integer minBIndex = 2;
	private final Integer maxBIndex = 3;

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(2, 100, 2, 100);
	}

	@Override
	public Integer resolveProblem() {
		Integer minA = getParameterForNumber(minAIndex);
		Integer maxA = getParameterForNumber(maxAIndex);
		Integer minB = getParameterForNumber(minBIndex);
		Integer maxB = getParameterForNumber(maxBIndex);

		Set<String> powers = new HashSet<String>();
		for (int a = minA; a <= maxA; a++) {
			powers.addAll(getPowerForNumberBelow(a, minB, maxB));
		}
		return powers.size();
	}

	private Set<String> getPowerForNumberBelow(int number, int minPow, int maxPow) {

		Set<String> powers = new HashSet<String>();
		String stringPower = StringPower.getPowerForNumberBelow10(number, minPow);
		powers.add(stringPower);

		for (int i = minPow + 1; i <= maxPow; i++) {
			stringPower = StringAsNum.productTwoNumbers(number + "", stringPower);
			powers.add(stringPower);
		}
		return powers;
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 9183;
	}

}
