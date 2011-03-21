package pl.krajewski.euler.problems.implementations.problems_10_19;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.PrimeNumbers;

public class Problem10 extends Problem<Double> {

	public Problem10(Parameters parameters) {
		super(parameters);
	}

	@Override
	public Double resolveProblem() {
		int max = getParameterForNumber(0);
		
		double sum = 0.0;
		for(double i=1; i<max; i++) {
			if(PrimeNumbers.isNumberPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}

}
