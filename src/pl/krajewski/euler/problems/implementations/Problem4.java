package pl.krajewski.euler.problems.implementations;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;

public class Problem4 extends Problem<Integer> {

	public Problem4(Parameters parameters) {
		super(parameters);
	}
	
	@Override
	public Integer resolveProblem() {
		int maxDigits = getParameterForNumber(0);
		
		int min = (int)Math.pow(10,maxDigits-1);
		int max = (int)Math.pow(10,maxDigits);
		
		int maxPalindrome = 0;
		for(int i=min; i<max; i++) {
			for(int j=min; j<max; j++) {
				int num = i*j;
				if(num > maxPalindrome && isPalindrome(num)) {
					maxPalindrome = num;
				}
			}
		}
		
		return maxPalindrome;
	}
	
	private boolean isPalindrome(int number) {
		String s = String.valueOf(number);
		if(s == null || s.trim().isEmpty()) {
			return false;
		}
		s = s.trim();
		int len = s.length();
		int endIndex = getEndIndexForLen(len);
		
		int len2 = len-1;
		for(int i=0; i<endIndex; i++) {
			char charFront = s.charAt(i);
			char charEnd = s.charAt(len2 - i);
			
			if(charFront != charEnd) {
				return false;
			}
		}
		return true;
	}

	private int getEndIndexForLen(int len) {
		int endIndex = 0;
		if(len%2 == 0) {
			endIndex = len/2;
		}
		else {
			endIndex = len/2-1;
		}
		return endIndex;
	}

}
