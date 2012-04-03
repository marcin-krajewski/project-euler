package pl.krajewski.euler.problems.implementations.problems111_120;

import java.util.HashMap;
import java.util.Map;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.numbers.TilesUtil;

public class Problem117 extends Problem<Long> {

	@Override
	public Long getCorrectProblemAnswer() {
		return 100808458960497L;
	}

	@Override
	protected Map<Parameters, Long> getTestAnswers() {
		Map<Parameters, Long> answers = new HashMap<Parameters, Long>();
		answers.put(new Parameters(5), 15L);
		return answers;
	}

	@Override
	public Long resolveProblem() {
		Integer maxTiles = getParameterForNumber(0);
		return TilesUtil.getInstance().getMovesWithReturningColors(maxTiles);
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(50);
	}

}
