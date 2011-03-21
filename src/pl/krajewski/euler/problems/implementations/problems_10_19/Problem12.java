package pl.krajewski.euler.problems.implementations.problems_10_19;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.Divisors;
import pl.krajewski.euler.problems.utils.SequenceOfTriangle;

public class Problem12 extends Problem<Double> {

	public Problem12(Parameters parameters) {
		super(parameters);
	}

	@Override
	public Double resolveProblem() {
		int divisorsCount = getParameterForNumber(0);
		
		Double level = (double)divisorsCount; 
		while(true) {
			double value = SequenceOfTriangle.getTriangle(level++);
			int divisors = Divisors.getCountOfDivisorsForNumber(value);
			if(divisors > divisorsCount) {
				return value;
			}
		}
	}

}
