package pl.krajewski.euler.problems.implementations.problems011_020;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.string.Factorial;
import pl.krajewski.euler.problems.utils.string.StringAsNum;

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
