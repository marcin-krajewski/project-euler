package pl.krajewski.euler.problems.implementations.problems021_030;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.AbundantNumbers;
import pl.krajewski.euler.problems.utils.math.PrimeFactor;
import pl.krajewski.euler.problems.utils.math.PrimeNumbers;
import pl.krajewski.euler.problems.utils.numbers.primes.EratosthenesSieve;
import pl.krajewski.euler.problems.utils.numbers.primes.MillerRabinPrime;

public class Problem023 extends Problem<Integer> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(28123);
	}

	@Override
	public Integer resolveProblem() {

		Integer maxNumber = getParameterForNumber(0);

		boolean abundant[] = new boolean[maxNumber];
		boolean abundantSums[] = new boolean[maxNumber + 1];

		List<Integer> primes = new EratosthenesSieve().getPrimesBelowNumber(maxNumber + 1);
		for (int currentNumber = 1; currentNumber <= maxNumber; currentNumber++) {
			if (!primes.contains(currentNumber) && AbundantNumbers.isAbundant(currentNumber)) {
				abundant[currentNumber] = true;
			}
		}

		for (int i = 1; i < abundant.length; i++) {
			if (abundant[i]) {
				for (int j = 1; j + i <= maxNumber; j++) {
					if (abundant[j]) {
						abundantSums[i + j] = true;
					}
				}
			}
		}

		Integer sumOfPositiveIntegersNotSummedWithTwoAbundants = 0;
		for (int currentNumber = 1; currentNumber <= maxNumber; currentNumber++) {
			if (!abundantSums[currentNumber]) {
				sumOfPositiveIntegersNotSummedWithTwoAbundants += currentNumber;
			}
		}

		return sumOfPositiveIntegersNotSummedWithTwoAbundants;
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 4179871;
	}

	@Override
	protected Map<Parameters, Integer> getTestAnswers() {
		Map<Parameters, Integer> map = new HashMap<Parameters, Integer>();
		map.put(new Parameters(15), 120);
		return map;
	}

}
