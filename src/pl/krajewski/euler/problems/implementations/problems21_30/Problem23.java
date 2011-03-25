package pl.krajewski.euler.problems.implementations.problems21_30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.ProblemResolver;
import pl.krajewski.euler.problems.utils.math.PrimeFactor;

public class Problem23 extends Problem<Double> {

	@Override
	public Double resolveProblem() {
		
		int max = getParameterForNumber(0);
		
		Set<Integer> map = new HashSet<Integer>();
		
		Double sum = 0.0;
		for(int i=1; i<=max; i++) {
			Integer divisorsSum = (int)PrimeFactor.getUniqueFactorsSummed((double)i);
			if(divisorsSum > i) {
				map.add(i);
			}
			sum += (double)i;
		}
		
		Set<Double> sums = new HashSet<Double>();
		double sum2;
		for(Integer abundant1 : map) {
			for(Integer abundant2 : map) {
				sum2 = (double)(abundant1+abundant2);
				if(sum2 <= max && !sums.contains(sum2)) {
					sums.add(sum2);
					sum -= sum2;
				}
			}
		}
		
		return sum;
	}

}
