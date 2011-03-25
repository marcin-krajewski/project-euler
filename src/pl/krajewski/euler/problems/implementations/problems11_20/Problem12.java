package pl.krajewski.euler.problems.implementations.problems11_20;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.Divisors;
import pl.krajewski.euler.problems.utils.numbers.SequenceOfTriangle;

public class Problem12 extends Problem<Double> {

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
