package pl.com.simbit.euler.problems.implementations.problems041_050;

import java.util.HashMap;
import java.util.Map;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;

public class Problem047 extends Problem<Integer> {

	@Override
	public Integer getCorrectProblemAnswer() {
		return 134043;
	}

	@Override
	public Integer resolveProblem() {

		Integer max = getParameterForNumber(0);

		int ni;
		for (int number = 2;; number++) {

			int count = 0;
			for (int i = 0; i < max; i++) {
				ni = number + i;
				// if (PrimeFactor.primeFactorsCountWithMax(ni, max) != max) {
				// number = ni;
				// break;
				// }
				count++;
			}
			if (count == max) {
				return number;
			}

		}
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(4);
	}

	@Override
	protected Map<Parameters, Integer> getTestAnswers() {
		Map<Parameters, Integer> map = new HashMap<Parameters, Integer>();
		map.put(new Parameters(2), 14);
		map.put(new Parameters(3), 644);
		return map;
	}
}
