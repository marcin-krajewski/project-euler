package pl.com.simbit.euler.problems.implementations.problems021_030;

import java.util.HashMap;
import java.util.Map;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.problems.math.Permutations;

public class Problem024 extends Problem<String> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(getMapForProblem24(), 1000000);
	}

	private static Map<Integer, String> getMapForProblem24() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "0");
		map.put(2, "1");
		map.put(3, "2");
		map.put(4, "3");
		map.put(5, "4");
		map.put(6, "5");
		map.put(7, "6");
		map.put(8, "7");
		map.put(9, "8");
		map.put(10, "9");
		return map;
	}

	@Override
	public String resolveProblem() {
		Map<Integer, String> mapOfSignsToPermuteWithPriorities = getParameterForNumber(0);
		Integer indexOfExpectedPermutation = getParameterForNumber(1);

		return Permutations.createPermutations(mapOfSignsToPermuteWithPriorities, indexOfExpectedPermutation)
				.get(indexOfExpectedPermutation).toString();
	}

	@Override
	public String getCorrectProblemAnswer() {
		return "2783915460";
	}

}
