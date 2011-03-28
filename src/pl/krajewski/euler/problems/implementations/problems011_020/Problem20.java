package pl.krajewski.euler.problems.implementations.problems011_020;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.string.Factorial;
import pl.krajewski.euler.problems.utils.string.StringAsNum;

public class Problem20 extends Problem<Integer> {

	@Override
	public Integer resolveProblem() {
		int max = getParameterForNumber(0);
		return StringAsNum.sumNumbersInStringNumber(Factorial.factorial(max));
	}

}
