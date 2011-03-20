package pl.krajewski.euler.problems.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrimeFactor {

	public static Double[] getPrimeFactorsOfNumber(double number) {
		List<Double> list = new ArrayList<Double>();
		
		double factor = number;
		while(factor > 1) {
			System.out.println("FACTOR "+factor);
			for(double i=2; i<=factor; i++) {
				
				if(factor%i == 0.0f) {
					factor = factor / i;
					list.add(i);
					break;
				}
			}
		}
		System.out.println("LIST "+list);
		return list.toArray(new Double[]{});
	}
	
	public static Set<Double> getUniquePrimeFactorsOfNumber(double number) {
		Double[] factors = getPrimeFactorsOfNumber(number);
		
		Set<Double> set = new HashSet<Double>();
		for(int i=0; i<factors.length; i++) {
			set.add(factors[i]);
		}
		System.out.println("SET "+set);
		return set;
	}
	
	public static Double getUniqueFactorsMultiplied(double number) {

		Set<Double> factorsOfNumber = getUniquePrimeFactorsOfNumber(number);
		double result = 1;
		for(Double i : factorsOfNumber) {
			result *= i;
		}
		return result;
	}
	
	public static Double getLargestPrimeFactorOfNumber(double number) {
		Set<Double> factorsOfNumber = getUniquePrimeFactorsOfNumber(number);
		
		double max = 0.0;
		for(Double f : factorsOfNumber) {
			if(max < f) {
				max = f;
			}
		}
		return max;
	}
}
