package pl.krajewski.euler.problems.utils;

public class Factorial {

	public static double factorial(double num) {
		if(num == 1.0) {
			return num;
		}
		return num*factorial(num-1);
	}
}
