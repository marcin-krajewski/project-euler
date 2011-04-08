package pl.krajewski.euler.problems.implementations.problems021_030;

import java.util.HashSet;
import java.util.Set;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.utils.classes.ArrayUtils;
import pl.krajewski.euler.problems.utils.math.PrimeFactor;

public class Problem021 extends pl.krajewski.euler.problems.Problem<Integer> {

    @Override
    protected Parameters getParametersForProblem() {
        return new Parameters(10000);
    }
    
	@Override
	public Integer resolveProblem() {

		int max = getParameterForNumber(0);

		Integer[] sums = ArrayUtils.createArrayWithSizeAndValue(max, null,
				Integer.class);

		Set<Integer> amicablePairs = new HashSet<Integer>();

		Integer temp = 0;
		Integer temp2 = 0;

		int index = 2;

		while (index < max) {

			if (sums[index] != null) {
				index++;
				continue;
			}

			int sum = (int) PrimeFactor.getUniqueFactorsSummed((double) index);

			sums[index] = sum;

			temp = sum;
			while (true) {
				try {
					if (temp2 != null) {
						break;
					}
					sums[temp] = (int) PrimeFactor
							.getUniqueFactorsSummed((double) temp);
					temp = sums[temp];
				}
				catch (ArrayIndexOutOfBoundsException ex) {
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
			}
			catch (ArrayIndexOutOfBoundsException ex) {

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
