package pl.krajewski.euler.problems.implementations.problems21_30;

import pl.krajewski.euler.problems.Problem;

public class Problem27 extends Problem<Integer> {

	private Integer maxAbsoluteOfAIndex = 0;
	private Integer maxAbsoluteOfBIndex = 1;

	@Override
	public Integer resolveProblem() {
		int maxAbsoluteOfA = getParameterForNumber(maxAbsoluteOfAIndex);
		int maxAbsoluteOfB = getParameterForNumber(maxAbsoluteOfBIndex);

		int a;
		int b;
		int result = 0;
		//	Obliczono zakres na kartce (dla 1000)
		//	X nale¿y do <10, 72>
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

}
