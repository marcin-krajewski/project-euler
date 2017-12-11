package pl.com.simbit.euler.problems.implementations.problems031_040;

import java.util.HashMap;
import java.util.Map;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.string.Factorial;

public class Problem034 extends Problem<Double> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters();
	}

	@Override
	public Double resolveProblem() {

		Map<Integer, Integer> factorials = new HashMap<Integer, Integer>();

		for (int i = 0; i < 10; i++) {
			factorials.put(i, Factorial.numberFactorial(i));
		}

		Double sumOfNumbers = 0.0;

		int sumOfFactorials;
		int number = 11;
		int tempNumber;

		while (number < 6 * factorials.get(9)) {

			sumOfFactorials = 0;
			tempNumber = number;

			while (tempNumber > 0) {
				sumOfFactorials += factorials.get(tempNumber % 10);
				tempNumber /= 10;
			}

			if (sumOfFactorials == number) {
				sumOfNumbers += number;
			}

			number++;
		}

		return sumOfNumbers;
	}

	@Override
	public Double getCorrectProblemAnswer() {
		return 40730.0;
	}
}
