package pl.krajewski.euler.problems.implementations.problems11_20;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.Factorial;

public class Problem15 extends Problem<Double> {

	@Override
	public Double resolveProblem() {
		double gridWidth = getParameterForNumber(0);
		
		int width = (int)gridWidth;
		
		Double[][] tab = new Double[width+1][width+1];
		for(int i=0; i<width+1; i++) {
			for(int j=0; j<width+1; j++) {
				tab[i][j] = null;
			}
		}
		
		return res(width, width, tab);
	}
	
	public double res(int i, int j, Double[][] tab) {
		
		if(tab[i][j] != null) {
			return tab[i][j];
		}
		
		if(i == 0 || j == 0) {
			tab[i][j] = 1.0;
			return tab[i][j];
		}
		
		tab[i][j] = res(i-1, j, tab)+res(i, j-1, tab);
		return tab[i][j];
	}
}
