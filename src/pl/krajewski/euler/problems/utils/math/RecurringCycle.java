package pl.krajewski.euler.problems.utils.math;

public class RecurringCycle {

	public static int getReccuringCycleLengthForNumber(double number) {
		String stringNumber = new Double(1.0/number).toString();
		
		System.out.println("REC "+stringNumber);
		div(1.131235412321341,213123.1230);
		
		return 0;
	}
	
	public static void div(double number1, double number2) {
		while(true) {
			if(number2 % 1 == 0) {
				break;
			}
			number1 *= 10.0;
			number2 *= 10.0;
		}
		
		boolean contains1 = false;
		boolean notContainsMore = false;
		
		while (contains1 && notContainsMore) {
			break;
		}
		
	}
}
