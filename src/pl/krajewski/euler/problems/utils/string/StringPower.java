package pl.krajewski.euler.problems.utils.string;

import java.util.ArrayList;
import java.util.List;

public class StringPower {

	public static String getPowerForNumberBelow10(int number, int pow) {
		
		String stringPower = "1";
		for(int i=0; i<pow; i++) {
			stringPower = StringAsNum.productTwoNumbers(number+"", stringPower);
		}
		return stringPower;
	}
}
