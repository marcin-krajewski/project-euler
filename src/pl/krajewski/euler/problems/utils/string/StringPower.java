package pl.krajewski.euler.problems.utils.string;

import java.util.ArrayList;
import java.util.List;

public class StringPower {

	public static String getPowerForNumberBelow10(int number, int pow) {
		
	    if(number == 0) {
	        return "0";
	    }
	    if(pow == 0) {
	        return "1";
	    }
	    if(pow == 1) {
	        return number+"";
	    }
		String stringPower = "1";
		for(int i=0; i<pow; i++) {
			stringPower = StringAsNum.productTwoNumbers(number+"", stringPower);
		}
		return stringPower;
	}
}
