package pl.com.simbit.euler.problems.implementations.problems021_030;

import java.util.HashSet;
import java.util.Set;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.classes.ArrayUtils;
import pl.com.simbit.utility.math.PrimeFactor;

public class Problem021 extends Problem<Integer> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(10000);
	}

	@Override
	public Integer resolveProblem() {

		Integer max = getParameterForNumber(0);

		Integer[] sums = ArrayUtils.createArrayWithSizeAndValue(max, null, Integer.class);

		Set<Integer> amicablePairs = new HashSet<Integer>();

		Integer temp = 0;
		Integer temp2 = 0;

		int index = 2;

		while (index < max) {

			if (sums[index] != null) {
				index++;
				continue;
			}

			int sum = (int) PrimeFactor.getUniqueFactorsSummed(index);

			sums[index] = sum;

			temp = sum;
			while (true) {
				try {
					if (temp2 != null) {
						break;
					}
					sums[temp] = (int) PrimeFactor.getUniqueFactorsSummed(temp);
					temp = sums[temp];
				} catch (ArrayIndexOutOfBoundsException ex) {
					break;
				}
			}
			index++;
		}

		for (Integer i = 0; i < max; i++) {
			try {
				Integer sumI = sums[i];
				if (sumI != null) {
					if (i.equals(sums[sumI]) && !i.equals(sumI)) {
						amicablePairs.add(i);
						amicablePairs.add(sumI);
					}
				}
			} catch (ArrayIndexOutOfBoundsException ex) {

			}
		}

		int sum = 0;
		for (Integer amicable : amicablePairs) {
			sum += amicable;
		}

		return sum;
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 31626;
	}

}
