package pl.krajewski.euler.problems.implementations.problems1_10;

import java.util.HashSet;
import java.util.Set;
import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.LeastCommonMultiple;

public class Problem5 extends Problem<Double> {

	public Problem5(Parameters parameters) {
		super(parameters);
	}

	@Override
	public Double resolveProblem() {
		double min = getParameterForNumber(0);
		double max = getParameterForNumber(1);
		
		Set<Double> set = new HashSet<Double>();
		for(double i=min; i <= max; i++) {
			set.add(i);
		}
		return LeastCommonMultiple.getLeastCommonMultipleForAllInSet(set);
	} 

}
