package pl.com.simbit.euler.problems.implementations.problems011_020;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.classes.MapDoubleKey;
import pl.com.simbit.utility.string.FileReader;

public class Problem018 extends Problem<Double> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters("problem18.txt");
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

		double max = 0.0;
		int row = map.k1Values().size() - 1;
		for (int col : map.k2ValuesForK1(row)) {
			double best = best(row, col, map, was);
			if (best > max) {
				max = best;
			}
		}
		return max;
	}

	private Double best(int row, int col, MapDoubleKey<Integer, Integer, Integer> map,
			MapDoubleKey<Integer, Integer, Double> was) {

		Integer integer = map.get(row, col);
		if (integer == null) {
			return null;
		}

		Double returnValue = was.get(row, col);

		Double bestL = null;
		Double bestR = null;

		if (returnValue == null) {
			if (row > 0 && returnValue == null) {
				bestL = best(row - 1, col - 1, map, was);
				bestR = best(row - 1, col, map, was);

				if (bestL == null) {
					returnValue = bestR + integer;
				} else if (bestR == null) {
					returnValue = bestL + integer;
				} else {
					returnValue = Math.max(bestL, bestR) + integer;
				}
			} else {
				returnValue = Double.valueOf(integer + "");
			}
			was.put(row, col, returnValue);
		}
		return returnValue;
	}

	@Override
	public Double getCorrectProblemAnswer() {
		return 1074.0;
	}

}
