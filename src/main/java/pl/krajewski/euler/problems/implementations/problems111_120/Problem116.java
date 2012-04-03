package pl.krajewski.euler.problems.implementations.problems111_120;

import java.util.HashMap;
import java.util.Map;

import pl.krajewski.euler.ProblemGetter;
import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.classes.MapDoubleKey;
import pl.krajewski.euler.problems.utils.numbers.TilesUtil;

public class Problem116 extends Problem<Long> {

	@Override
	public Long getCorrectProblemAnswer() {
		return 20492570929L;
	}

	@Override
	protected Map<Parameters, Long> getTestAnswers() {
		Map<Parameters, Long> answers = new HashMap<Parameters, Long>();
		answers.put(new Parameters(5, 4), 12L);
		return answers;
	}

	@Override
	public Long resolveProblem() {
		Integer maxTiles = getParameterForNumber(0);
		Integer colorsNumber = getParameterForNumber(1);

		long sum = 0;
		MapDoubleKey<Integer, Integer, Long> map = new MapDoubleKey<Integer, Integer, Long>();
		for (int i = 2; i <= colorsNumber; i++) {
			long moves = TilesUtil.getInstance().getMovesWithCacheMap(maxTiles, i, map);
			sum += moves;
		}
		return sum;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(50, 4);
	}

}
