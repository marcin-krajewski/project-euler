package pl.krajewski.euler.problems.implementations.problems021_030;

import java.util.HashSet;
import java.util.Set;
import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.classes.MapDoubleKey;
import pl.krajewski.euler.problems.utils.string.StringAsNum;
import pl.krajewski.euler.problems.utils.string.StringPower;

public class Problem029 extends Problem<Integer> {

	private Integer minAIndex = 0;
	private Integer maxAIndex = 1;
	private Integer minBIndex = 2;
	private Integer maxBIndex = 3;

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(2, 100, 2, 100);
	}

	@Override
	public Integer resolveProblem() {
		int minA = getParameterForNumber(minAIndex);
		int maxA = getParameterForNumber(maxAIndex);
		int minB = getParameterForNumber(minBIndex);
		int maxB = getParameterForNumber(maxBIndex);

		Set<String> powers = new HashSet<String>();
		for (int a = minA; a <= maxA; a++) {
			powers.addAll(getPowerForNumberBelow(a, minB, maxB));
		}
		return powers.size();
	}

	private Set<String> getPowerForNumberBelow(int number, int minPow,
			int maxPow) {

		Set<String> powers = new HashSet<String>();
		String stringPower = StringPower.getPowerForNumberBelow10(number,
				minPow);
		powers.add(stringPower);

		for (int i = minPow + 1; i <= maxPow; i++) {
			stringPower = StringAsNum.productTwoNumbers(number + "",
					stringPower);
			powers.add(stringPower);
		}
		return powers;
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 9183;
	}

}
