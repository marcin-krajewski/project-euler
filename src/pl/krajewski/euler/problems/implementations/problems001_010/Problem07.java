package pl.krajewski.euler.problems.implementations.problems001_010;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.PrimeNumbers;

public class Problem07 extends Problem<Double> {

	@Override
	public Double resolveProblem() {
		int index = getParameterForNumber(0);
		return PrimeNumbers.getPrimeNumberForIndex(index);
	}

}
