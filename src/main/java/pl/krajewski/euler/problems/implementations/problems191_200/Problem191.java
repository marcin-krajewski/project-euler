package pl.krajewski.euler.problems.implementations.problems191_200;

import java.util.HashMap;
import java.util.Map;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;

public class Problem191 extends Problem<Long> {

	@Override
	public Long getCorrectProblemAnswer() {
		return 1918080160L;
	}

	@Override
	public Long resolveProblem() {
		Integer days = getParameterForNumber(0);
		return getDays(days);
	}

	private Long getDays(Integer days) {
		return recursiveDays(days, 0, 0, 0);
	}

	private Long recursiveDays(int lastDay, int position, int absentCount, int lCount) {

		if (lCount > 1 || absentCount > 2) {
			return 0L;
		}

		if (position == lastDay) {
			return 1L;
		}

		return recursiveDays(lastDay, position + 1, 0, lCount) + recursiveDays(lastDay, position + 1, 0, lCount + 1)
				+ recursiveDays(lastDay, position + 1, absentCount + 1, lCount);
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(30);
	}

	@Override
	protected Map<Parameters, Long> getTestAnswers() {
		Map<Parameters, Long> map = new HashMap<Parameters, Long>();
		map.put(new Parameters(4), 43L);
		return map;
	}

}
