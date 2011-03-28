package pl.krajewski.euler.problems.implementations.problems011_020;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.Divisors;
import pl.krajewski.euler.problems.utils.numbers.SequenceOfTriangle;

public class Problem012 extends Problem<Double> {

	@Override
	public Double resolveProblem() {
		int divisorsCount = getParameterForNumber(0);

		Double level = (double) divisorsCount;
		double value = SequenceOfTriangle.getTriangle(level);
		while (true) {
			int divisors = Divisors.getCountOfDivisorsForNumber(value);
			if (divisors > divisorsCount) {
				return value;
			}
			level++;
			value += level;
		}
	}

}
