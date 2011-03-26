package pl.krajewski.euler.problems.utils.math;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrimeFactor {

	public static Double[] getPrimeFactorsOfNumber(double number) {
		List<Double> list = new ArrayList<Double>();
		
		double factor = number;
		while(factor > 1) {
			for(double i=2; i<=factor; i++) {
				
				if(factor%i == 0.0f) {
					factor = factor / i;
					list.add(i);
					break;
				}
			}
		}
//		System.out.println("LIST "+list);
		return list.toArray(new Double[]{});
	}
	
	public static Set<Double> getUniquePrimeFactorsOfNumber(double number) {
		
		Double[] factors = getPrimeFactorsOfNumber(number);
		
		Set<Double> set = new HashSet<Double>();
		for(int i=0; i<factors.length; i++) {
			set.add(factors[i]);
		}
//		System.out.println("NUMBER: "+number+ " --- SET "+set);
		return set;
	}
	
	public static Double getUniqueFactorsMultiplied(double number) {

		return multiplyFactors(getUniquePrimeFactorsOfNumber(number));
	}
	
	public static double getUniqueFactorsSummed(double number) {
	    
		double sum = 0.0;
		for(double i=1.0; i<=number/2.0; i++) {
            if(number % i == 0.0) {
                sum += i;
            }
        }
	    return sum;
	}
	
    public static Double multiplyFactors(Set<Double> factors) {
		
		double result = 1;
		for(Double i : factors) {
			result *= i;
		}
		return result;
	}
	
	public static Double sumFactors(Set<Double> factors) {
	    
	    double result = 0;
	    for(Double i : factors) {
	        result += i;
	    }
	    return result;
	}
	
	public static Double getLargestPrimeFactorOfNumber(double number) {
		
		Set<Double> factorsOfNumber = getUniquePrimeFactorsOfNumber(number);
		
		double max = 0.0;
		for(Double currentFactor : factorsOfNumber) {
			if(max < currentFactor) {
				max = currentFactor;
			}
		}
		return max;
	}
}
