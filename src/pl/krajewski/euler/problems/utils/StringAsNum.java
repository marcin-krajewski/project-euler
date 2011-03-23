package pl.krajewski.euler.problems.utils;

public class StringAsNum {

	public static int[] getStringAsNumArray0IsHigherMaxIsLower(String s) {
		return getStringAsNumArray(s, true);
	}
	public static int[] getStringAsNumArray0IsLowerMaxIsHigher(String s) {
		return getStringAsNumArray(s, false);
	}
	public static int[] getStringAsNumArray(String s, boolean reverse) {
		
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
		int[] numbers = new int[len];
		
		int len2 = len-1;
		for(int i=0; i<len; i++) {
			char c = s.charAt(i);
			if(reverse) {
				numbers[i] = Integer.parseInt(Character.toString(c));
			}
			else {
				numbers[len2-i] = Integer.parseInt(Character.toString(c));
			}
		}
		
//		System.out.print(" S "+s+" >>>");
//		for(int i=len2; i>=0; i--) {
//			System.out.print(numbers[i]);
//		}
//		System.out.print("<<<");
		
		return numbers;
	}
	
	public static String sumStringNumbers(String[] strings) {

		StringBuilder sb = new StringBuilder();
		
		int maxLen = 0;
		for(String s : strings) {
			int len = s.length();
			if(len > maxLen) {
				maxLen = len;
			}
		}
		
		int c = 0;
		String string;
        for(int i=maxLen-1; i>=0; i--) {
            int sum = c;
            for(String s : strings) {
            	try {
            		string = Character.toString(s.charAt(i));
            	}
            	catch(IndexOutOfBoundsException ex) {
            		string = "0";
            	}
				int num = Integer.parseInt(string);
                sum += num;
            }
            int result = sum%10;
            c = (sum/10);
            sb.append(result);
            if(i == 0) {
                sb.append( (new StringBuilder(String.valueOf(c))).reverse().toString());
            }
        }
		
        return sb.reverse().toString();
	}
}
