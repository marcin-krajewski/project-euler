package pl.krajewski.euler.problems.implementations.problems21_30;

import java.util.Map;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.Permutations;

public class Problem24 extends Problem<String> {

	@Override
	public String resolveProblem() {
		Map<Integer, String> mapOfSignsToPermuteWithPriorities = getParameterForNumber(0);
		int indexOfExpectedPermutation = getParameterForNumber(1);

		return Permutations
				.createPermutations(mapOfSignsToPermuteWithPriorities,
						indexOfExpectedPermutation)
				.get(indexOfExpectedPermutation).toString();
	}

}
