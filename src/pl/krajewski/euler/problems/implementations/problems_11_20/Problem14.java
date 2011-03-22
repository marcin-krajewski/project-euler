package pl.krajewski.euler.problems.implementations.problems_11_20;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.CollatzSequence;

public class Problem14  extends Problem<Double> {

	public Problem14(Parameters parameters) {
		super(parameters);
	}

	@Override
	public Double resolveProblem() {
		double number = getParameterForNumber(0);
		
		double max = 0.0;
		double temp;
		double res = 0.0;
		for(double i=1.0; i<number; i++) {
			temp = CollatzSequence.numberOfSteps(i);
			if(temp > max) {
				max = temp;
				res = i;
			}
		}
			
		
		return res;
	}

}