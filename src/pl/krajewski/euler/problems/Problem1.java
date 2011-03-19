package pl.krajewski.euler.problems;

public class Problem1 extends Problem implements ProblemResolver<Integer> {

	public Problem1(Parameters parameters) {
		super(parameters);
	}
	
	@Override
	public Integer resolveProblem() {
		
		Integer multiplier1 = this.parameters.getParameterForNumber(0);
		Integer multiplier2 = this.parameters.getParameterForNumber(1);
		Integer max = this.parameters.getParameterForNumber(2);
		
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
