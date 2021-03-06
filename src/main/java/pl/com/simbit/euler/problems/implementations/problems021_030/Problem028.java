package pl.com.simbit.euler.problems.implementations.problems021_030;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;

public class Problem028 extends Problem<Double> {

	private final Integer spiralWidthIndex = 0;

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1001);
	}

	@Override
	public Double resolveProblem() {
		Integer spiralWidth = getParameterForNumber(spiralWidthIndex);

		int oneIndex = spiralWidth / 2;

		int[][] spiralNumbersArray = new int[spiralWidth][spiralWidth];

		int oneDist = 0;

		int nextValue = 1;
		spiralNumbersArray[oneIndex][oneIndex] = nextValue++;

		int x;
		int y;
		int setX, setY;
		while (oneDist < oneIndex) {
			y = oneIndex - oneDist++;
			x = oneIndex + oneDist;
			int max = 2 * oneDist;

			for (int yy = 0; yy < max; yy++) {
				setX = x;
				setY = y + yy;
				spiralNumbersArray[setX][setY] = nextValue++;
			}
			for (int xx = 0; xx < max; xx++) {
				setX = x - xx - 1;
				setY = y + max - 1;
				spiralNumbersArray[setX][setY] = nextValue++;
			}
			for (int yy = max - 1; yy >= 0; yy--) {
				setX = x - max;
				setY = y + yy - 1;
				spiralNumbersArray[setX][setY] = nextValue++;
			}
			for (int xx = max - 1; xx >= 0; xx--) {
				setX = x - xx;
				setY = y - 1;
				spiralNumbersArray[setX][setY] = nextValue++;
			}
		}

		double diagonalSum = 0;
		for (x = 0; x < spiralWidth; x++) {
			for (y = 0; y < spiralWidth; y++) {
				if (isPointDiagonal(x, y, spiralWidth)) {
					diagonalSum += spiralNumbersArray[x][y];
				}
			}
		}

		return diagonalSum;
	}

	private boolean isPointDiagonal(int x, int y, int width) {
		if (x == y) {
			return true;
		}
		if (x == width - y - 1) {
			return true;
		}
		if (y == width - x - 1) {
			return true;
		}
		return false;
	}

	@Override
	public Double getCorrectProblemAnswer() {
		return 669171001.0;
	}

}
