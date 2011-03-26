package pl.krajewski.euler.problems.utils.math;

import pl.krajewski.euler.problems.utils.string.StringAsNum;

public class FibonacciSequence {

	public static String findFibonacciStringForIndex(int index) {
		String prev1 = "1";
		if(index == 1) {
			return prev1;
		}
		String prev2 = "1";
		if(index == 2) {
			return prev2;
		}
		
		String value = "";
		for(int i=3; i<=index; i++) {
			value = StringAsNum.sumStringNumbersReverse(new String[] {prev1, prev2});
			prev1 = prev2;
			prev2 = value;
		}
		return StringAsNum.clearStringNumberFromLeadingZeros(value);
	}
	
	public static int getFirstTermOfFibonacciWithNumberOfDigits(int numberOfDigits) {
		String prev1 = "1";
		String prev2 = "1";
		String value = "";
		int index = 3;
		while(true) {
			value = StringAsNum.sumStringNumbersReverse(new String[] {prev1, prev2});
			if(value.length() >= numberOfDigits) {
				return index;
			}
			index++;
			prev1 = prev2;
			prev2 = value;
		}
	}
}
