package pl.krajewski.euler.problems.implementations.problems21_30;

import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.RecurringCycle;

public class Problem26 extends Problem<Integer> {

	private Integer maximumNumberIndex = 0;

	@Override
	public Integer resolveProblem() {
		int maximumNumber = getParameterForNumber(maximumNumberIndex);
		
		int maximumResult = 0;
		int maximumIndex = 0;
		for(double currentNumber = 1.0; currentNumber < maximumNumber; currentNumber++) {
			
			int cycleLength = RecurringCycle.getReccuringCycleLengthForNumber(currentNumber);
			if(cycleLength > maximumResult) {
				maximumResult = cycleLength;
				maximumIndex = (int)currentNumber;
			}
		}
		return maximumIndex;
	}

}
