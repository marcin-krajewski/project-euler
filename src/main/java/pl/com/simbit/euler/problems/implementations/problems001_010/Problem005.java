package pl.com.simbit.euler.problems.implementations.problems001_010;

import java.util.HashSet;
import java.util.Set;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.problems.math.LeastCommonMultiple;

public class Problem005 extends Problem<Double> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1.0, 20.0);
	}

	@Override
	public Double resolveProblem() {
		Double min = getParameterForNumber(0);
		Double max = getParameterForNumber(1);

		Set<Double> set = new HashSet<Double>();
		for (double i = min; i <= max; i++) {
			set.add(i);
		}
		return LeastCommonMultiple.getLeastCommonMultipleForAllInSet(set);
	}

	@Override
	public Double getCorrectProblemAnswer() {
		return 232792560.0;
	}

}
