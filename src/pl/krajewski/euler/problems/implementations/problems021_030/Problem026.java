package pl.krajewski.euler.problems.implementations.problems021_030;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.RecurringCycle;

public class Problem026 extends Problem<Integer> {

	private final Integer maximumNumberIndex = 0;

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1000);
	}

	@Override
	public Integer resolveProblem() {
		Integer maximumNumber = getParameterForNumber(maximumNumberIndex);

		int maximumResult = 0;
		int maximumIndex = 0;
		for (double currentNumber = 1.0; currentNumber < maximumNumber; currentNumber++) {

			int cycleLength = RecurringCycle.getReccuringCycleLengthForNumber(currentNumber);
			if (cycleLength > maximumResult) {
				maximumResult = cycleLength;
				maximumIndex = (int) currentNumber;
			}
		}
		return maximumIndex;
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 983;
	}

}
