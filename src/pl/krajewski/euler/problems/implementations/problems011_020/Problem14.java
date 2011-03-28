package pl.krajewski.euler.problems.implementations.problems011_020;

import java.util.HashMap;
import java.util.Map;
import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.numbers.CollatzSequence;

public class Problem14 extends Problem<Double> {

	@Override
	public Double resolveProblem() {
		double number = getParameterForNumber(0);

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

}
