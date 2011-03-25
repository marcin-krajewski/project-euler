package pl.krajewski.euler.problems.utils.string;

import java.util.ArrayList;
import java.util.List;

public class StringPower {

	public static String getPowerForNumberBelow10(int number, int pow) {
		
		String stringPower = "1";
//		int c;
//		int[] tab;
//		int temp;
		for(int i=0; i<pow; i++) {
			
			
			stringPower = StringAsNum.productTwoNumbers(number+"", stringPower);
//			c = 0;
//			tab = StringAsNum.getStringAsNumArray0IsLowerMaxIsHigher(stringPower);
//			
//			List<String> list = new ArrayList<String>();
//			int tempNumber = number;
//			int zeros = 0;
//			while(tempNumber > 0) {
//				StringBuilder sb = new StringBuilder();
//				
//				for(int ii=0; ii<zeros; ii++) {
//					sb.append("0");
//				}
//				
//				for(int j=0; j<tab.length; j++) {
//					temp = (tempNumber%10)*tab[j]+c;
//					c = temp/10;
//					sb.append(temp%10);
//					if(j == tab.length-1 && c != 0) {
//						sb.append((new StringBuilder(String.valueOf(c))).reverse());
//					}
//				}
//				list.add(sb.toString());
//				tempNumber /= 10;
//				zeros++;
//			}
//			stringPower = StringAsNum.sumStringNumbers(list.toArray(new String[]{}));
		}
		return stringPower;
	}
}
