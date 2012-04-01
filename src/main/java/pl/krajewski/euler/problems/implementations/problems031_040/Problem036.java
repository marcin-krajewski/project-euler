package pl.krajewski.euler.problems.implementations.problems031_040;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.BinaryNumber;
import pl.krajewski.euler.problems.utils.numbers.PalindromNumbers;

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
