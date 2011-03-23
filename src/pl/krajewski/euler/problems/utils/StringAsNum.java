package pl.krajewski.euler.problems.utils;

public class StringAsNum {

	public static int[] getStringAsNumArray0IsLowerMaxIsHigher(String s) {
		
		s = s.trim();
		
		int index = 0;
		while(true) {
			char c = s.charAt(index);
			if(c != '0') {
				break;
			}
			index++;
		}
		s = s.substring(index);
		
		int len = s.length();
		int[] numbers = new int[len+1];
		
		int len2 = len-1;
		for(int i=0; i<len; i++) {
			char c = s.charAt(i);
			numbers[len2-i] = Integer.parseInt(Character.toString(c));
		}
		
		numbers[len] = 0;
//		System.out.print(" S "+s+" >>>");
//		for(int i=len; i>=0; i--) {
//			System.out.print(numbers[i]);
//		}
//		System.out.print("<<<");
		
		return numbers;
	}
}
