package pl.krajewski.euler.problems.implementations.problems031_040;

import java.util.HashMap;
import java.util.Map;
import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.classes.ArrayUtils;
import pl.krajewski.euler.problems.utils.numbers.Triangle;

public class Problem039 extends Problem<Integer> {

	private Integer maxPerimeterIndex = 0;

	@Override
	public Integer resolveProblem() {
		int maxPerimeter = getParameterForNumber(maxPerimeterIndex);

		Integer[] triangles = ArrayUtils.createArrayWithSizeAndValue(
				maxPerimeter + 1, 0, Integer.class);

		int maxPerimeterDiv2 = maxPerimeter / 2;
		for (int a = 1; a <= maxPerimeterDiv2; a++) {
			for (int b = a + 1; b <= maxPerimeterDiv2; b++) {
				for (int c = b + 1; c <= maxPerimeterDiv2; c++) {
					int perimeter = a + b + c;
					if (perimeter > maxPerimeter) {
						continue;
					}
					if (a * a + b * b != c * c) {
						continue;
					}
					triangles[perimeter]++;
				}
			}
		}

		int max = 0;
		int maxIndex = 0;
		for (int trianglePerimeter = 1; trianglePerimeter <= maxPerimeter; trianglePerimeter++) {
			if (triangles[trianglePerimeter] > max) {
				max = triangles[trianglePerimeter];
				maxIndex = trianglePerimeter;
			}
		}

		return maxIndex;
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 840;
	}

	@Override
	protected Map<Parameters, Integer> getTestAnswers() {
		Map<Parameters, Integer> map = new HashMap<Parameters, Integer>();
		map.put(new Parameters(120), 120);
		return map;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1000);
	}

}
