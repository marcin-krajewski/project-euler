package pl.krajewski.euler.problems.implementations.problems01_10;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;

public class Problem01 extends Problem<Integer> {

	private Integer multiplier1Index = 0;
	private Integer multiplier2Index = 1;
	private Integer maximumNumberIndex = 2;

	@Override
	public Integer resolveProblem() {

		Integer multiplier1 = this.getParameterForNumber(multiplier1Index);
		Integer multiplier2 = this.getParameterForNumber(multiplier2Index);
		Integer maximumNumber = this.getParameterForNumber(maximumNumberIndex);

		int resultOfProblem1 = 0;
		for (int currentNumber = 1; currentNumber < maximumNumber; currentNumber++) {

			if (currentNumber % multiplier1 == 0) {
				resultOfProblem1 += currentNumber;
			}
			else if (currentNumber % multiplier2 == 0) {
				resultOfProblem1 += currentNumber;
			}
		}

		return resultOfProblem1;
	}

}
