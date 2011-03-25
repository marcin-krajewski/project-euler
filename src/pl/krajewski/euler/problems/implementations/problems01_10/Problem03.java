package pl.krajewski.euler.problems.implementations.problems01_10;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.PrimeFactor;

public class Problem03 extends Problem<Double> {

	@Override
	public Double resolveProblem() {
		Double number = getParameterForNumber(0);
		return PrimeFactor.getLargestPrimeFactorOfNumber(number);
	}

}
