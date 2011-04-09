package pl.krajewski.euler.problems.implementations.problems200_210;

import java.util.HashMap;
import java.util.Map;
import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;

public class Problem210 extends Problem<Double> {

	private Integer radiusIndex = 0;

	@Override
	public Double resolveProblem() {

		double radius = getParameterForNumber(radiusIndex);

		double rdiv2 = radius / 2.0;
		double rdiv4 = rdiv2 / 2.0;
		double rdiv8 = rdiv4 / 2.0;

		double result = 0.0;

		double rdiv4plus1 = rdiv4 + 1;
		System.out.println("ROZPOCZÊTO!");
		// PRZEDZIA£ I

		result = rdiv4 * rdiv4 * 24;

		result += rdiv4 * rdiv4plus1 - 2;

		System.out.println("SPRAWDZONO PRZEDZIA£Y");

		double rdiv8pow2 = rdiv8 * rdiv8;
		double rdiv8mul2 = rdiv8 * 2;

		if (rdiv8 % 1 == 0) {
			for (double y = rdiv4 + 1.0; y < rdiv8 * (1 + Math.sqrt(2.0)); y++) {
				result += 4;
			}
		}
		System.out.println("SPRAWDZONO PRZYPADEK POJEDYNCZY");

		double add = 0.0;
		double prevChanged = 0.0;
		System.out.println("PREV CHANGED " + prevChanged);
		double funValue;
		for (double x = 1; x < rdiv8; x++) {
			funValue = Math.sqrt(rdiv8pow2 - x * (x - rdiv8mul2)) - rdiv8;
			while (funValue - prevChanged > 1.0) {
				prevChanged++;
				add++;
			}
			result += 8 * add;
		}
		System.out.println("KO£O SPRAWDZONE");

		return result;
	}

	@Override
	public Double getCorrectProblemAnswer() {
		return 100.0;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(500000000.0);
	}

	@Override
	protected Map<Parameters, Double> getTestAnswers() {
		Map<Parameters, Double> testAnswers = new HashMap<Parameters, Double>();
		testAnswers.put(new Parameters(4.0), 24.0);
		testAnswers.put(new Parameters(8.0), 100.0);
		testAnswers.put(new Parameters(12.0), 226.0);
		testAnswers.put(new Parameters(100.0), 15944.0);
		testAnswers.put(new Parameters(10000.0), 159814790.0);
		testAnswers.put(new Parameters(100000.0), 15981722482.0);
		testAnswers.put(new Parameters(1000000.0), 1598174519142.0);
		return testAnswers;
	}

}
