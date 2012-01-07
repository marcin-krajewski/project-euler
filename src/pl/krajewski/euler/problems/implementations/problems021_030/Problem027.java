package pl.krajewski.euler.problems.implementations.problems021_030;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;

public class Problem027 extends Problem<Integer> {

	private final Integer maxAbsoluteOfAIndex = 0;
	private final Integer maxAbsoluteOfBIndex = 1;

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1000, 1000);
	}

	@Override
	public Integer resolveProblem() {
		Integer maxAbsoluteOfA = getParameterForNumber(maxAbsoluteOfAIndex);
		Integer maxAbsoluteOfB = getParameterForNumber(maxAbsoluteOfBIndex);

		int a;
		int b;
		int result = 0;
		// Obliczono zakres na kartce (dla 1000)
		// X nale�y do <10, 72>
		for (int currentValue = 10; currentValue <= 71; currentValue++) {

			a = getAForValue(currentValue);
			b = getBForValue(currentValue);
			if (Math.abs(a) >= maxAbsoluteOfA) {
				continue;
			}
			if (Math.abs(b) >= maxAbsoluteOfB) {
				continue;
			}
			result = a * b;
		}
		return result;

	}

	private int getAForValue(int value) {
		return 81 - 2 * value;
	}

	private int getBForValue(int value) {
		return value * value - 81 * value + 1681;
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return -59231;
	}

}
