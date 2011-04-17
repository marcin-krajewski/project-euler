package pl.krajewski.euler.problems.implementations.problems200_210;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.string.StringAsNum;

public class Problem210 extends Problem<String> {

	private Integer radiusIndex = 0;

	@Override
	public String resolveProblem() {

		double radius = getParameterForNumber(radiusIndex);

		double rdiv2 = radius / 2.0;
		double rdiv2minus2 = rdiv2 - 2.0;
		double rdiv4 = rdiv2 / 2.0;
		double rdiv4minus1 = rdiv4 - 1.0;
		double rdiv8 = rdiv4 / 2.0;
		double rdiv8plus1 = rdiv8 + 1.0;

		String resultS = "0";

		System.out.println("ROZPOCZÊTO!");
		// PRZEDZIA£ I

		String formatRDiv4 = format(rdiv4);
		String resultOfProductFirstRange = StringAsNum.productTwoNumbers(
				formatRDiv4, formatRDiv4);
		resultOfProductFirstRange = StringAsNum.productTwoNumbers(
				resultOfProductFirstRange, "24");

		String resultOfProductAndSum = StringAsNum.productTwoNumbers(
				format(rdiv4minus1), formatRDiv4);
		resultOfProductAndSum = StringAsNum.sumStringNumbers(new String[] {
				resultOfProductFirstRange, resultOfProductAndSum,
				format(rdiv2minus2) });
		resultS = resultOfProductAndSum;

		double numberOfPointsInRange = 0.0;
		if (rdiv8 % 1 == 0) {
			double oneMinusSqrt2MulRDiv8 = rdiv8 * (1 + Math.sqrt(2.0)) - 1.0;
			for (double y = rdiv4; y < oneMinusSqrt2MulRDiv8; y++) {
				numberOfPointsInRange++;
			}
		}
		resultS = StringAsNum.sumStringNumbers(new String[] { resultS,
				format(numberOfPointsInRange * 4.0) });

		double rdiv8pow2 = rdiv8 * rdiv8;
		double rdiv8mul2 = rdiv8 * 2;

		double prevChanged = 0.0;

		numberOfPointsInRange = 0.0;

		for (double x = 1; x < rdiv8; x++) {
			if (Math.sqrt(rdiv8pow2 - x * (x - rdiv8mul2)) > prevChanged
					+ rdiv8plus1) {
				prevChanged++;
			}
			numberOfPointsInRange += prevChanged;
		}
		resultS = StringAsNum.sumStringNumbers(new String[] { resultS,
				format(8.0 * numberOfPointsInRange) });

		return resultS;
	}

	private String format(double d) {
		return (new DecimalFormat("0")).format(d);
	}

	@Override
	public String getCorrectProblemAnswer() {
		return "1598174770174689458";
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1000000000.0);
	}

	@Override
	protected Map<Parameters, String> getTestAnswers() {
		Map<Parameters, String> testAnswers = new HashMap<Parameters, String>();
		testAnswers.put(new Parameters(4.0), "24");
		testAnswers.put(new Parameters(8.0), "100");
		testAnswers.put(new Parameters(12.0), "226");
		testAnswers.put(new Parameters(100.0), "15944");
		testAnswers.put(new Parameters(10000.0), "159814790");
		testAnswers.put(new Parameters(100000.0), "15981722482");
		testAnswers.put(new Parameters(1000000.0), "1598174519142");
		testAnswers.put(new Parameters(100000000.0), "15981747679237090");
		testAnswers.put(new Parameters(500000000.0), "399543692481157754");
		testAnswers.put(new Parameters(1000000000.0), "1598174770174689458");
		return testAnswers;
	}

}
