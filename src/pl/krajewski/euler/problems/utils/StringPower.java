package pl.krajewski.euler.problems.utils;

public class StringPower {

	public static String getPowerForNumberBelow10(int number, int pow) {
		
		if(number >= 10) {
			return "";
		}
		String stringPower = "1";
		int c;
		int[] tab;
		int temp;
		for(int i=0; i<pow; i++) {
			
			c = 0;
			tab = StringAsNum.getStringAsNumArray0IsLowerMaxIsHigher(stringPower);
			
			StringBuilder sb = new StringBuilder();
			for(int j=0; j<tab.length; j++) {
				
				temp = number*tab[j]+c;
				c = temp/10;
				sb.append(temp%10);
				if(j == tab.length-1) {
					sb.append((new StringBuilder(c)).reverse());
				}
			}
			stringPower = sb.reverse().toString();
		}
		return stringPower;
	}
}
