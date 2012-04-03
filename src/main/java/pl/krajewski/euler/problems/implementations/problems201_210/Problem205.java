package pl.krajewski.euler.problems.implementations.problems201_210;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;

public class Problem205 extends Problem<String> {

	@Override
	public String getCorrectProblemAnswer() {
		return "0.5731441";
	}

	@Override
	public String resolveProblem() {
		Integer peterMax = getParameterForNumber(0);
		Integer peterCount = getParameterForNumber(1);
		Integer colinMax = getParameterForNumber(2);
		Integer colinCount = getParameterForNumber(3);
		Map<Integer, Integer> sumsPeter = getAllSums(peterMax, peterCount);
		Map<Integer, Integer> sumsColin = getAllSums(colinMax, colinCount);

		Double correct = 0.0;

		for (Entry<Integer, Integer> peterEntry : sumsPeter.entrySet()) {
			for (Entry<Integer, Integer> colinEntry : sumsColin.entrySet()) {
				Integer peterS = peterEntry.getKey();
				Integer peterC = peterEntry.getValue();
				Integer colinS = colinEntry.getKey();
				Integer colinC = colinEntry.getValue();
				if (peterS > colinS) {
					correct += colinC * peterC;
				}
			}
		}
		
		double d = correct
		/ (Math.pow(peterMax, peterCount) * Math.pow(colinMax,
				colinCount));

		DecimalFormat twoDForm = new DecimalFormat("#.#######");
        return twoDForm.format(d);
	}

	public Map<Integer, Integer> getAllSums(int max, int count) {
		Map<Integer, Integer> list = new HashMap<Integer, Integer>();
		add(max, count, 0, list);
		return list;
	}

	private void add(int max, int count, int sum, Map<Integer, Integer> map) {
		if (count == 0) {
			Integer sumCount = map.get(sum);
			if (sumCount == null) {
				sumCount = 0;
			}
			map.put(sum, sumCount + 1);
			return;
		}
		for (int i = 1; i <= max; i++) {
			add(max, count - 1, sum + i, map);
		}
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(4, 9, 6, 6);
	}

}
