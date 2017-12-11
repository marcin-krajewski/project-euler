package pl.com.simbit.euler.problems.implementations.problems021_030;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.math.AbundantNumbers;
import pl.com.simbit.utility.numbers.primes.EratosthenesSieve;

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
