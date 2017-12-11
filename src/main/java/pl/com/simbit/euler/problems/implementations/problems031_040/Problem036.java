package pl.com.simbit.euler.problems.implementations.problems031_040;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.problems.math.BinaryNumber;
import pl.com.simbit.utility.problems.numbers.PalindromNumbers;

public class Problem036 extends Problem<Integer> {

	private Integer maxNumberIndex = 0;

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1000000);
	}

	@Override
	public Integer resolveProblem() {

		Integer maxNumber = getParameterForNumber(maxNumberIndex);

		Integer sum = 0;

		for (int number = 1; number < maxNumber; number += 2) {
			if (PalindromNumbers.isNumberPalindrome(number)) {
				String binaryStringForNumber = BinaryNumber.getBinaryStringForNumber(number);
				if (PalindromNumbers.isStringPalindrome(binaryStringForNumber)) {
					sum += number;
				}
			}
		}

		return sum;
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 872187;
	}
}
