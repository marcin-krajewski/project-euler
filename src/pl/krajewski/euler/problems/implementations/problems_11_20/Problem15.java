package pl.krajewski.euler.problems.implementations.problems_11_20;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.Factorial;

public class Problem15 extends Problem<Double> {

	public Problem15(Parameters parameters) {
		super(parameters);
	}

	@Override
	public Double resolveProblem() {
		double gridWidth = getParameterForNumber(0);
		return Factorial.factorial((long)gridWidth+1);
	}
	
	public double resolveWithoutRecursion(double width) {
		double res = 1.0;
		double temp = width;
		for(int i=0; i<width; i++) {
			res += temp++;
		}
		return res;
	}
	
	public void resolveWithRecursion(int i, int j, Double[] count, double width) {
		if(i == width && j == width) {
			count[0]++;
		}
		if(i < width) {
			resolveWithRecursion(i+1, j, count, width);
		}
		if(j < width) {
			resolveWithRecursion(i, j+1, count, width);
		}
	}
}
