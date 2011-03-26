package pl.krajewski.euler.problems.implementations.problems21_30;

import java.util.Map;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.Permutations;

public class Problem24 extends Problem<String> {

	@Override
	public String resolveProblem() {
		Map<Integer, String> priorities = getParameterForNumber(0);
		int ind = getParameterForNumber(1);
		
		return Permutations.createPermutations(priorities,ind).get(ind).toString();
	}

}
