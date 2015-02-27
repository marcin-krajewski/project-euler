package pl.krajewski.euler.problems.implementations.problems001_010;

import java.util.List;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.numbers.primes.EratosthenesSieve;

public class Problem010 extends Problem<Long> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(2000000);
	}

	@Override
	public Long resolveProblem() {
		Integer max = getParameterForNumber(0);
		List<Integer> primesBelowNumber = new EratosthenesSieve().getPrimesBelowNumber(max);
		long sum = 0;
		for (int i : primesBelowNumber) {
			sum += i;
		}
		return sum;
	}

	@Override
	public Long getCorrectProblemAnswer() {
		return 142913828922L;
	}

}
