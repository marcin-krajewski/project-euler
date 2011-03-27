package pl.krajewski.euler.problems.utils.math;

public class PrimeNumbers {

	public static boolean isNumberPrime(double number) {
		if(number == 1.0) {
			return false;
		}
		double len = Math.sqrt(number);
		for(double i=2; i<=len; i++) {
			if(number%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static Double getPrimeNumberForIndex(int index) {
		int i=0;
		int j = 2;
		double prime = 0.0;
		while(i < index) {
			if(isNumberPrime(j)) {
				prime = j;
				i++;
			}
			j++;
		}
		return prime;
	}
}