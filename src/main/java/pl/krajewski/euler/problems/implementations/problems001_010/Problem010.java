package pl.krajewski.euler.problems.implementations.problems001_010;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.PrimeNumbers;

public class Problem010 extends Problem<Double> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(2000000);
	}

	@Override
	public Double resolveProblem() {
		Integer max = getParameterForNumber(0);

		double sum = 2.0;
		for (double i = 3; i < max; i += 2) {
			if (PrimeNumbers.isNumberPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}

	@Override
	public Double getCorrectProblemAnswer() {
		return 142913828922.0;
	}

}
