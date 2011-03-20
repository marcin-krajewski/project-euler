package pl.krajewski.euler.problems.implementations;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.PrimeFactor;

public class Problem3 extends Problem<Double> {

	public Problem3(Parameters params) {
		super(params);
	}
	
	@Override
	public Double resolveProblem() {
		Double number = getParameterForNumber(0);
		return PrimeFactor.getLargestPrimeFactorOfNumber(number);
	}

}
