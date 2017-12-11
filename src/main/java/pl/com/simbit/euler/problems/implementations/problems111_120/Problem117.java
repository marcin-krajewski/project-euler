package pl.com.simbit.euler.problems.implementations.problems111_120;

import java.util.HashMap;
import java.util.Map;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.numbers.TilesUtil;

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
