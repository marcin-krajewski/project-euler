package pl.com.simbit.euler.problems.implementations.problems171_180;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;

public class Problem174 extends Problem<Integer> {

	@Override
	public Integer getCorrectProblemAnswer() {
		return 209566;
	}

	@Override
	protected Map<Parameters, Integer> getTestAnswers() {
		Map<Parameters, Integer> answers = new HashMap<Parameters, Integer>();
		answers.put(new Parameters(15, 15), 832);
		return answers;
	}

	@Override
	public Integer resolveProblem() {
		Integer minN = getParameterForNumber(0);
		Integer maxN = getParameterForNumber(1);
		Integer maxNumberOfTiles = 1000000 / 4;

		Map<Integer, Integer> tilesAndCount = new HashMap<Integer, Integer>();
		for (Integer i = 1; i <= maxNumberOfTiles; i++) {
			tilesAndCount.put(i, 0);
		}

		for (int emptyC = 1; emptyC <= maxNumberOfTiles; emptyC++) {
			for (int rowsInTiles = 1;; rowsInTiles++) {
				Integer tiles = rowsInTiles * emptyC + rowsInTiles * rowsInTiles;
				if (tiles > maxNumberOfTiles) {
					break;
				}
				incrementCountInMap(tiles, tilesAndCount);
			}
		}

		int count = 0;
		for (Entry<Integer, Integer> entry : tilesAndCount.entrySet()) {
			if (entry.getValue() >= minN && entry.getValue() <= maxN) {
				count++;
			}
		}
		return count;
	}

	private void incrementCountInMap(Integer res, Map<Integer, Integer> values) {
		Integer integer = values.get(res);
		if (integer == null) {
			return;
		}
		values.put(res, integer + 1);
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1, 10);
	}

}
