package pl.krajewski.euler.problems.implementations.problems021_030;

import java.util.Map;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.Permutations;

public class Problem024 extends Problem<String> {

	@Override
	public String resolveProblem() {
		int indexOfExpectedPermutation = getParameterForNumber(1);

		return Permutations
				.getPermutationForIndex(indexOfExpectedPermutation);
	}

}
