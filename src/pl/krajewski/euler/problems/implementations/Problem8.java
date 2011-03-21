package pl.krajewski.euler.problems.implementations;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.FileReader;

public class Problem8 extends Problem<Integer> {

	public Problem8(Parameters parameters) {
		super(parameters);
	}

	@Override
	public Integer resolveProblem() {
		String fileName = getParameterForNumber(0);
		int consecutiveDigits = getParameterForNumber(1);
		
		Integer result = 0;
		
		String number = FileReader.readProblemFileInOneLine(fileName).trim();
		int res = 1;
		int len = number.length();
		for(int i=0; i<=len-consecutiveDigits; i++, res = 1) {
			for(int j=i; j<i+consecutiveDigits; j++) {
				res *= Integer.parseInt(number.substring(j, j+1));
			}
			if(res > result) {
				result = res;
			}
		}
		
		return result;
	}

}
