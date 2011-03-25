package pl.krajewski.euler.problems.utils.string;


public class Factorial {

	public static double factorial(double num) {
		if(num == 1.0) {
			return num;
		}
		return num*factorial(num-1);
	}
	
	public static String factorial(int max) {
		String factorial = "1";
		for(int i=1; i<=max; i++) {
			factorial = StringAsNum.productTwoNumbers(i+"", factorial);
		}
		return factorial;
	}
}
