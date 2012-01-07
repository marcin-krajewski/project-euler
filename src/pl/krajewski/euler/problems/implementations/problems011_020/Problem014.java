package pl.krajewski.euler.problems.implementations.problems011_020;

import java.util.HashMap;
import java.util.Map;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.numbers.CollatzSequence;

public class Problem014 extends Problem<Double> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1000000.0);
	}

	@Override
	public Double resolveProblem() {
		Double number = getParameterForNumber(0);

		double max = 0.0;
		double temp;
		double res = 0.0;
		Map<Double, Double> map = new HashMap<Double, Double>();
		for (double i = 1.0; i < number; i++) {
			temp = CollatzSequence.numberOfSteps(i, map);
			map.put(i, temp);
			if (temp > max) {
				max = temp;
				res = i;
			}
		}
		return res;
	}

	@Override
	public Double getCorrectProblemAnswer() {
		return 837799.0;
	}

}
