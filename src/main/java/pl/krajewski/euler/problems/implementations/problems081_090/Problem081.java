package pl.krajewski.euler.problems.implementations.problems081_090;

import java.util.HashMap;
import java.util.Map;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.classes.MapDoubleKey;
import pl.krajewski.euler.problems.utils.string.FileReader;

public class Problem081 extends Problem<Double> {

	@Override
	public Double getCorrectProblemAnswer() {
		return 427337.0;
	}

	@Override
	protected Map<Parameters, Double> getTestAnswers() {
		Map<Parameters, Double> map = new HashMap<Parameters, Double>();
		map.put(new Parameters("problem081-test.txt"), 2427.0);
		return map;
	}

	@Override
	public Double resolveProblem() {
		String fileName = getParameterForNumber(0);

		MapDoubleKey<Integer, Integer, Integer> map = FileReader
				.getLinesWithNumbersSeparatedWithSpaceForFileName(fileName);

		return updateRoads(map);
	}

	public Double updateRoads(MapDoubleKey<Integer, Integer, Integer> map) {

		MapDoubleKey<Integer, Integer, Double> was = new MapDoubleKey<Integer, Integer, Double>();
		int row = map.k1Values().size() - 1;
		Double best = best(row, map.k2ValuesForK1(row).size() - 1, map, was);
		return best;
	}

	private Double best(int row, int col, MapDoubleKey<Integer, Integer, Integer> map,
			MapDoubleKey<Integer, Integer, Double> was) {

		Integer integer = map.get(row, col);
		if (integer == null) {
			return null;
		}

		Double returnValue = was.get(row, col);

		Double bestLeft = null;
		Double bestTop = null;

		if (returnValue == null) {
			if (row > 0 || col > 0) {
				bestLeft = best(row, col - 1, map, was);
				bestTop = best(row - 1, col, map, was);
				if (bestLeft == null) {
					returnValue = bestTop + integer;
				} else if (bestTop == null) {
					returnValue = bestLeft + integer;
				} else {
					returnValue = Math.min(bestLeft, bestTop) + integer;
				}
			} else {
				returnValue = Double.valueOf(integer + "");
			}
			was.put(row, col, returnValue);
		}
		return returnValue;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters("problem081.txt");
	}

}
