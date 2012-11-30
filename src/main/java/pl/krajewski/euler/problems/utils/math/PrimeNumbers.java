package pl.krajewski.euler.problems.utils.math;

import java.util.HashSet;
import java.util.Set;

import pl.krajewski.euler.problems.utils.string.StringAsNum;

public class PrimeNumbers {

	public static boolean isNumberPrime(double number) {
		if (number == 1.0) {
			return false;
		}
		if (number == 2.0) {
			return true;
		}

		if (((int) number & 1) == 0) {
			return false;
		}

		double testNum = 3.0;
		double testLimit = number;

		while (testLimit > testNum) {
			if (number % testNum == 0) {
				return false;
			}

			testLimit = (double) ((int) number / (int) testNum);

			testNum += 2.0;

		}
		return true;
	}

	public static Double getPrimeNumberForIndex(int index) {
		int i = 0;
		int j = 2;
		double prime = 0.0;
		while (i < index) {
			if (isNumberPrime(j)) {
				prime = j;
				i++;
			}
			j++;
		}
		return prime;
	}

	public static Set<Double> getPrimesBelowNumber(int number) {

		Set<Double> primeNumbersBelowNumber = new HashSet<Double>();
		for (double i = 2.0; i < number; i++) {
			if (isNumberPrime(i)) {
				primeNumbersBelowNumber.add(i);
			}
		}
		return primeNumbersBelowNumber;
	}

	public static double getSmallestPrimeLargerThanParameter(double n) {
		// TODO Auto-generated method stub
		return n + n;
	}
}
