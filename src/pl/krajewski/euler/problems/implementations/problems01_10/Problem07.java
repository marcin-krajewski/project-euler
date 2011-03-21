package pl.krajewski.euler.problems.implementations.problems01_10;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.PrimeNumbers;

public class Problem07 extends Problem<Double> {

	public Problem07(Parameters parameters) {
		super(parameters);
	}

	@Override
	public Double resolveProblem() {
		int index = getParameterForNumber(0);
		return PrimeNumbers.getPrimeNumberForIndex(index);
	}

}
