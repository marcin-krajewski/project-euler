package pl.krajewski.euler.problems.implementations.problems021_030;

import java.util.HashSet;
import java.util.Set;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.PrimeFactor;
import pl.krajewski.euler.problems.utils.math.PrimeNumbers;

public class Problem023 extends Problem<Double> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(28123);
	}

	@Override
	public Double resolveProblem() {

		Integer maxNumber = getParameterForNumber(0);

		Set<Double> abundantNumbers = new HashSet<Double>();
		for (double currentNumber = 1.0; currentNumber <= maxNumber; currentNumber++) {

			if (PrimeNumbers.isNumberPrime(currentNumber)) {
				continue;
			}

			if (PrimeFactor.getUniqueFactorsSummed(currentNumber) > currentNumber) {
				abundantNumbers.add(currentNumber);
			}
		}

		double currentNumberAndAbundantDiff;
		boolean isNumberSumOfTwoAbundants;
		Double sumOfPositiveIntegersNotSummedWithTwoAbundants = 0.0;
		for (double currentNumber = 1.0; currentNumber <= maxNumber; currentNumber++) {

			isNumberSumOfTwoAbundants = false;
			for (Double currentAbundant : abundantNumbers) {

				currentNumberAndAbundantDiff = currentNumber - currentAbundant;
				if (currentNumberAndAbundantDiff <= 0) {
					continue;
				}
				if (abundantNumbers.contains(currentNumberAndAbundantDiff)) {
					isNumberSumOfTwoAbundants = true;
					break;
				}
			}
			if (!isNumberSumOfTwoAbundants) {
				sumOfPositiveIntegersNotSummedWithTwoAbundants += currentNumber;
			}
		}

		return sumOfPositiveIntegersNotSummedWithTwoAbundants;
	}

	@Override
	public Double getCorrectProblemAnswer() {
		return 4179871.0;
	}

}
