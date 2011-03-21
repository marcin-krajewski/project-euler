package pl.krajewski.euler.problems.implementations.problems01_10;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;

public class Problem09 extends Problem<Integer> {

	public Problem09(Parameters parameters) {
		super(parameters);
	}

	@Override
	public Integer resolveProblem() {
		
		int sum = getParameterForNumber(0);
		
		for(int i=1; i<=sum; i++) {
			for(int j=i+1; j<=sum; j++) {
				for(int k=j+1; k<=sum;k++) {
					if(i+j+k != sum) {
						continue;
					}
					if(i*i + j*j != k*k) {
						continue;
					}
					return i*j*k;
				}
			}
		}
		
		return 0;
	}

}
