package pl.krajewski.euler.problems.implementations.problems031_040;

import java.util.HashSet;
import java.util.Set;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;

public class Problem032 extends Problem<Double> {

	private final Integer minDigitIndex = 0;
	private final Integer maxDigitIndex = 1;

	@Override
	protected Parameters getParametersForProblem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double resolveProblem() {

		Integer min = getParameterForNumber(minDigitIndex);
		Integer max = getParameterForNumber(maxDigitIndex);

		double sum = 0.0;
		Set<Integer> products = new HashSet<Integer>();

		int product;
		String string;
		int maxMinusMinPlus1 = max - min + 1;

		for (int i = 2; i < 9877; i++) {
			for (int j = i + 1; j < 9877; j++) {

				product = i * j;
				if (products.contains(product)) {
					continue;
				}

				string = i + "" + j;
				if (string.length() > (maxMinusMinPlus1 - String.valueOf(j).length())) {
					break;
				}
				string += product;
				if (isNumStringFromMinToMaxDigits(min, max, string)) {
					sum += product;
					products.add(product);
				}
			}
		}

		return sum;
	}

	private boolean isNumStringFromMinToMaxDigits(int min, int max, String numString) {

		int result = max - min + 1;
		if (numString.length() != result) {
			return false;
		}
		for (int i = min; i <= max; i++) {
			if (!numString.contains(i + "")) {
				return false;
			}
		}
		return true;
	}

	@Override
	public Double getCorrectProblemAnswer() {
		return 45228.0;
	}
}
