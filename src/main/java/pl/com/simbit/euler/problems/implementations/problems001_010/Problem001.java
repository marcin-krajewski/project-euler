package pl.com.simbit.euler.problems.implementations.problems001_010;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;

public class Problem001 extends Problem<Integer> {

	private final Integer multiplier1Index = 0;
	private final Integer multiplier2Index = 1;
	private final Integer maximumNumberIndex = 2;

	@Override
	public Integer resolveProblem() {

		Integer multiplier1 = this.getParameterForNumber(multiplier1Index);
		Integer multiplier2 = this.getParameterForNumber(multiplier2Index);
		Integer maximumNumber = this.getParameterForNumber(maximumNumberIndex);

		int resultOfProblem1 = 0;
		for (int currentNumber = 1; currentNumber < maximumNumber; currentNumber++) {

			if (currentNumber % multiplier1 == 0) {
				resultOfProblem1 += currentNumber;
			} else if (currentNumber % multiplier2 == 0) {
				resultOfProblem1 += currentNumber;
			}
		}

		return resultOfProblem1;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(3, 5, 1000);
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 233168;
	}

}
