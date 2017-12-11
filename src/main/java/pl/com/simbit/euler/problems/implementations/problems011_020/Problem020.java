package pl.com.simbit.euler.problems.implementations.problems011_020;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.string.Factorial;
import pl.com.simbit.utility.string.StringAsNum;

public class Problem020 extends Problem<Integer> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(100);
	}

	@Override
	public Integer resolveProblem() {
		Integer max = getParameterForNumber(0);
		return StringAsNum.sumNumbersInStringNumber(Factorial.factorial(max));
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 648;
	}

}
