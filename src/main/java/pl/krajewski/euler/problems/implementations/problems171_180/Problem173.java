package pl.krajewski.euler.problems.implementations.problems171_180;

import java.util.HashMap;
import java.util.Map;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;

public class Problem173 extends Problem<Integer> {

	@Override
	public Integer getCorrectProblemAnswer() {
		return 1572729;
	}

	@Override
	protected Map<Parameters, Integer> getTestAnswers() {
		Map<Parameters, Integer> answers = new HashMap<Parameters, Integer>();
		answers.put(new Parameters(32, 32), 2);
		answers.put(new Parameters(0, 100), 41);
		return answers;
	}

	@Override
	public Integer resolveProblem() {
		Integer minNumberOfTiles = getParameterForNumber(0);
		Integer maxNumberOfTiles = getParameterForNumber(1);

		int count = 0;
		int nextSingleTileSquareLength, tilesToUse;

		for (int emptySquareLength = 1; emptySquareLength <= (maxNumberOfTiles - 4) / 4; emptySquareLength++) {
			nextSingleTileSquareLength = emptySquareLength + 1;
			tilesToUse = maxNumberOfTiles - 4 * nextSingleTileSquareLength;
			while (tilesToUse >= 0) {
				if (isUsedCorrectNumberOfTiles(minNumberOfTiles, maxNumberOfTiles, tilesToUse)) {
					count++;
				}
				nextSingleTileSquareLength += 2;
				tilesToUse -= 4 * nextSingleTileSquareLength;
			}
		}

		return count;
	}

	private boolean isUsedCorrectNumberOfTiles(Integer minTiles, Integer maxTiles, int tilesToUse) {
		return tilesToUse + minTiles <= maxTiles;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(0, 1000000);
	}

}
