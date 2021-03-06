package pl.com.simbit.euler.problems.implementations.problems091_100;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.classes.IntegerDoubleKey;
import pl.com.simbit.utility.string.FileReader;

public class Problem099 extends Problem<String> {

	@Override
	public String getCorrectProblemAnswer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String resolveProblem() {
		String fileName = getParameterForNumber(0);
		String[] readProblemFileLines = FileReader.readProblemFileLines(fileName);

		double temp;
		double tempExp;
		double max = 0.0;
		int lineNumber = 0;
		int result = -1;

		IntegerDoubleKey valuesWithLineNumber = new IntegerDoubleKey();

		for (String line : readProblemFileLines) {

			lineNumber++;

			String[] split = line.split(",");
			Integer base = Integer.valueOf(split[0]);
			Integer exp = Integer.valueOf(split[1]);

			valuesWithLineNumber.put(base, exp, lineNumber);
		}

		logger.info(valuesWithLineNumber.toString() + "C: " + valuesWithLineNumber.getCount());

		return result + "";
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters("problem099.txt");
	}

}
