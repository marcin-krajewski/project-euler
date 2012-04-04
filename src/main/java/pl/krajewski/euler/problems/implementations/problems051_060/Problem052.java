package pl.krajewski.euler.problems.implementations.problems051_060;

import java.util.HashSet;
import java.util.Set;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.string.StringAsNum;

public class Problem052 extends Problem<Long> {

	@Override
	public Long getCorrectProblemAnswer() {
		return 142857L;
	}

	@Override
	public Long resolveProblem() {
		
		long[] mul = new long[5];

		for (long i = 2;; i++) {
			mul[0] = i * 2;
			if (hasDoubleDigits(mul[0])) {
				continue;
			}
			mul[1] = i * 3;
			mul[2] = i * 4;
			mul[3] = i * 5;
			mul[4] = i * 6;
			for (int ind = 0; ind < 4; ind++) {
				if (!eq(mul[ind], mul[ind + 1])) {
					break;
				}
				if(ind == 3) {
					return i;
				}
			}
		}
	}

	private boolean eq(long mul2, long mul3) {
		int[] a = StringAsNum.getStringAsNumArray0IsLowerMaxIsHigher(mul2 + "");
		Set<Integer> set = new HashSet<Integer>();
		for (int num : a) {
			set.add(num);
		}
		int[] b = StringAsNum.getStringAsNumArray0IsLowerMaxIsHigher(mul3 + "");
		for (int num : b) {
			if (!set.contains(num)) {
				return false;
			}
		}
		return true;
	}

	private boolean hasDoubleDigits(long len2) {
		int[] a = StringAsNum.getStringAsNumArray0IsLowerMaxIsHigher(len2 + "");
		Set<Integer> set = new HashSet<Integer>();
		for (int num : a) {
			if (!set.add(num)) {
				return true;
			}
		}
		return false;
	}

	private int getLen(long value) {
		return String.valueOf(value).length();
	}

	@Override
	protected Parameters getParametersForProblem() {
		return null;
	}

}
