package pl.krajewski.euler.problems.implementations.problems01_10;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;

public class Problem01 extends Problem<Integer>  {

	public Problem01(Parameters parameters) {
		super(parameters);
	}
	
	@Override
	public Integer resolveProblem() {
		
		Integer multiplier1 = this.getParameterForNumber(0);
		Integer multiplier2 = this.getParameterForNumber(1);
		Integer max = this.getParameterForNumber(2);
		
		int ret = 0;
		for(int i=1; i<max; i++) {
			if(i%multiplier1 == 0) {
				ret += i;
			}
			else if(i%multiplier2 == 0) {
				ret += i;
			}
		}
		
		return ret;
	}

}
