package pl.krajewski.euler.problems.implementations.problems21_30;

import java.util.HashSet;
import java.util.Set;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.PrimeFactor;
import pl.krajewski.euler.problems.utils.math.PrimeNumbers;

public class Problem23 extends Problem<Double> {

	@Override
	public Double resolveProblem() {

		int maxNumber = getParameterForNumber(0);

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

}
