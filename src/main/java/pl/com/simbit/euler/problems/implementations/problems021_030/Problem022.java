package pl.com.simbit.euler.problems.implementations.problems021_030;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.problems.string.EnglishAlphabet;
import pl.com.simbit.utility.problems.string.FileReader;
import pl.com.simbit.utility.problems.string.StringUtils;

public class Problem022 extends Problem<Double> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters("problem22.txt", ",");
	}

	@Override
	public Double resolveProblem() {
		String fileName = getParameterForNumber(0);
		String separator = getParameterForNumber(1);

		String[] names = getNamesArrayForFileNameAndSeparator(fileName, separator);
		List<String> namesList = getSortedListForNamesArray(names);

		double value = 0.0;
		int index = 1;
		for (String name : namesList) {
			value += EnglishAlphabet.getStringDoubleValue(name.trim()) * (index++);
		}
		return value;
	}

	private String[] getNamesArrayForFileNameAndSeparator(String fileName, String separator) {

		String file = FileReader.readProblemFile(fileName).replaceAll("\"", "");
		String[] names = file.split(separator);
		return names;
	}

	private List<String> getSortedListForNamesArray(String[] names) {
		List<String> namesList = new ArrayList<String>();
		for (String name : names) {
			namesList.add(name);
		}
		Collections.sort(namesList, StringUtils.getStringComparator());
		return namesList;
	}

	@Override
	public Double getCorrectProblemAnswer() {
		return 871198282.0;
	}

}
