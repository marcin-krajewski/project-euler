package pl.com.simbit.euler.problems.implementations.problems111_120;

import java.util.HashMap;
import java.util.Map;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.numbers.TilesUtil;

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
		for (int i = 2; i <= colorsNumber; i++) {
			long moves = TilesUtil.getInstance().getMovesWithNotReturningColors(maxTiles, i);
			sum += moves;
		}
		return sum;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(50, 4);
	}

}
