package pl.krajewski.euler.problems.implementations.problems01_10;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;

public class Problem02 extends Problem<Integer> {

	@Override
	public Integer resolveProblem() {
		Integer max = this.getParameterForNumber(0);
		
		Integer ret = 0;
		
		int i = 1;
		int prev = 1;
		int temp;
		while(i < max) {
			if(i%2 == 0) {
				ret += i;
			}
			temp = i;
			i += prev;
			prev = temp;
		}
		
		return ret;
	}

}
