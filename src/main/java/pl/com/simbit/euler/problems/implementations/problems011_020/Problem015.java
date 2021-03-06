package pl.com.simbit.euler.problems.implementations.problems011_020;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;

public class Problem015 extends Problem<Double> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(20.0);
	}

	@Override
	public Double resolveProblem() {
		Double gridWidth = getParameterForNumber(0);

		int width = gridWidth.intValue();

		Double[][] tab = new Double[width + 1][width + 1];
		for (int i = 0; i < width + 1; i++) {
			for (int j = 0; j < width + 1; j++) {
				tab[i][j] = null;
			}
		}

		return res(width, width, tab);
	}

	public double res(int i, int j, Double[][] tab) {

		if (tab[i][j] != null) {
			return tab[i][j];
		}

		if ((i == 0) || (j == 0)) {
			tab[i][j] = 1.0;
			return tab[i][j];
		}

		tab[i][j] = res(i - 1, j, tab) + res(i, j - 1, tab);
		return tab[i][j];
	}

	@Override
	public Double getCorrectProblemAnswer() {
		return 137846528820.0;
	}
}
