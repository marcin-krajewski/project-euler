package pl.com.simbit.euler.problems.implementations.problems071_080;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.string.FileReader;

public class Problem079 extends Problem<String> {

	@Override
	public String getCorrectProblemAnswer() {
		return "73162890";
	}

	@Override
	public String resolveProblem() {
		String fileName = getParameterForNumber(0);

		String[] readProblemFileLines = FileReader.readProblemFileLines(fileName);

		Map<Character, Set<Character>> before = new HashMap<Character, Set<Character>>();

		for (String reply : readProblemFileLines) {
			Character c1 = reply.charAt(0);
			Character c2 = reply.charAt(1);
			Character c3 = reply.charAt(2);
			addCharsToBeforeMap(before, c1, c2, c3);
			addCharsToBeforeMap(before, c2, c3);
			addCharsToBeforeMap(before, c3);
		}

		int size = before.size();
		Character[] tab = new Character[size];
		for (Entry<Character, Set<Character>> entry : before.entrySet()) {
			tab[size - 1 - entry.getValue().size()] = entry.getKey();
		}

		StringBuilder result = new StringBuilder();
		for (Character c : tab) {
			result.append(c);
		}

		return result.toString();
	}

	private void addCharsToBeforeMap(Map<Character, Set<Character>> map, Character before, Character... after) {
		Set<Character> set = map.get(before);
		if (set == null) {
			set = new HashSet<Character>();
			map.put(before, set);
		}
		for (Character c : after) {
			set.add(c);
		}
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters("problem079.txt");
	}

}
