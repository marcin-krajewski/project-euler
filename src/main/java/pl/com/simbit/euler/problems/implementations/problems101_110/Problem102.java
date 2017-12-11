package pl.com.simbit.euler.problems.implementations.problems101_110;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.problems.classes.MapDoubleKey;
import pl.com.simbit.utility.problems.math.Point;
import pl.com.simbit.utility.problems.math.Triangle;
import pl.com.simbit.utility.problems.string.FileReader;

public class Problem102 extends Problem<Integer> {

	@Override
	public Integer getCorrectProblemAnswer() {
		return 228;
	}

	@Override
	public Integer resolveProblem() {
		String fileName = getParameterForNumber(0);
		MapDoubleKey<Integer, Integer, Integer> lines = FileReader
				.getLinesWithNumbersSeparatedWithSpaceForFileName(fileName);

		int sum = 0;
		for (Integer k1value : lines.k1Values()) {
			Point p1 = new Point(lines.get(k1value, 0), lines.get(k1value, 1));
			Point p2 = new Point(lines.get(k1value, 2), lines.get(k1value, 3));
			Point p3 = new Point(lines.get(k1value, 4), lines.get(k1value, 5));
			if (Triangle.isOriginInTriangle(p1, p2, p3)) {
				sum++;
			}
		}
		return sum;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters("problem102.txt");
	}

}
