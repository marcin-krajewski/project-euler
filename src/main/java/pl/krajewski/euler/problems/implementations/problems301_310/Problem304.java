package pl.krajewski.euler.problems.implementations.problems301_310;

import java.util.HashMap;
import java.util.Map;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.FibonacciSequence;
import pl.krajewski.euler.problems.utils.math.PrimeNumbers;

public class Problem304 extends Problem<String> {

	@Override
	public String resolveProblem() {
		Integer min = this.<Integer> getParameterForNumber(0);
		Integer max = this.<Integer> getParameterForNumber(1);

		System.out.println(getB_n(1.0));

		return "2.0";
	}

	private String getB_n(double n) {
		return FibonacciSequence.findFibonacciStringForDoubleIndex(getA_n(n));
	}

	private double getA_n(double n) {
		if (n <= 1.0) {
			return nextPrime(Math.pow(10, 1));
		}
		return nextPrime(getA_n(n - 1));
	}

	private double nextPrime(double n) {
		return PrimeNumbers.getSmallestPrimeLargerThanParameter(n);
	}

	@Override
	public String getCorrectProblemAnswer() {
		return "2.0";
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1, 100000);
	}

	@Override
	protected Map<Parameters, String> getTestAnswers() {
		Map<Parameters, String> parametersMap = new HashMap<Parameters, String>();
		parametersMap.put(new Parameters(1, 2), "2.0");
		parametersMap.put(new Parameters(2), "2.0");
		parametersMap.put(new Parameters(3), "2.0");
		return parametersMap;
	}

}
