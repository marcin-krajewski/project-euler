package pl.krajewski.euler.problems.implementations.problems031_040;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.numbers.ConcatenatedProductOfNumbers;

public class Problem038 extends Problem<Integer> {

	private Integer maxNumberIndex = 0;

	@Override
	public Integer resolveProblem() {

		int maxNumber = getParameterForNumber(maxNumberIndex);

		int max = 0;
		int index;
		int numberProduct;
		String numString;
		int parseInt;

		for (int i = 1; i < maxNumber; i++) {
			if (!ConcatenatedProductOfNumbers
					.checkIfNumberHasDifferentDigitsAndNotContains0(i)) {
				continue;
			}
			index = 2;
			numString = i + "";

			while (true) {

				numberProduct = i * index++;
				if (!ConcatenatedProductOfNumbers
						.checkIfNumberHasDifferentDigitsAndNotContains0(numberProduct)) {
					break;
				}
				numString += numberProduct;
				if (numString.length() > 9) {
					break;
				}
				if (!ConcatenatedProductOfNumbers
						.checkIfNumberHasDifferentDigitsAndNotContains0(Integer
								.parseInt(numString))) {
					break;
				}
				if (numString.length() == 9) {
					parseInt = Integer.parseInt(numString);
					if (parseInt > 0) {
						max = parseInt;
						break;
					}
				}
				break;
			}
		}

		return max;
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 932718654;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(98765);
	}

}