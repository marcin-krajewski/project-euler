package pl.krajewski.euler.problems.implementations.problems021_030;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.string.EnglishAlphabet;
import pl.krajewski.euler.problems.utils.string.FileReader;
import pl.krajewski.euler.problems.utils.string.StringUtils;

public class Problem22 extends Problem<Double> {

	@Override
	public Double resolveProblem() {
		String fileName = getParameterForNumber(0);
		String separator = getParameterForNumber(1);

		String[] names = getNamesArrayForFileNameAndSeparator(fileName,
				separator);
		List<String> namesList = getSortedListForNamesArray(names);

		double value = 0.0;
		int index = 1;
		for (String name : namesList) {
			value += getNameValue(name.trim()) * (index++);
		}
		return value;
	}

	private String[] getNamesArrayForFileNameAndSeparator(String fileName,
			String separator) {

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

	private Double getNameValue(String name) {
		Double value = 0.0;
		for (int i = 0; i < name.length(); i++) {
			value += EnglishAlphabet.letters.get(name.charAt(i));
		}
		return value;
	}

}
