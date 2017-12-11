package pl.com.simbit.euler.problems.implementations.problems051_060;

import java.util.HashSet;
import java.util.Set;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.problems.numbers.PalindromNumbers;
import pl.com.simbit.utility.problems.string.StringAsNum;

public class Problem055 extends Problem<Integer> {

	@Override
	public Integer getCorrectProblemAnswer() {
		return 249;
	}

	@Override
	public Integer resolveProblem() {
		Integer maxToCheck = getParameterForNumber(0);
		Integer numberOfIterations = getParameterForNumber(1);

		Set<String> notLychrelSet = new HashSet<String>();
		int numOfLychrel = 0;

		Set<String> tempSet = new HashSet<String>();
		String temp;
		boolean broke;

		for (int i = 1; i < maxToCheck; i++) {
			if (notLychrelSet.contains(i + "")) {
				continue;
			}
			tempSet.clear();
			temp = i + "";
			tempSet.add(temp);
			broke = false;
			for (int j = 0; j < numberOfIterations; j++) {
				temp = StringAsNum.sumStringNumbers(temp, new StringBuilder(temp).reverse().toString());

				if (PalindromNumbers.isStringPalindrome(temp)) {
					notLychrelSet.addAll(tempSet);
					broke = true;
					break;
				}
				tempSet.add(temp);
			}
			if (!broke) {
				numOfLychrel++;
			}
		}

		return numOfLychrel;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(10000, 50);
	}

}
