package pl.krajewski.euler.problems.implementations.problems021_030;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.string.StringAsNum;
import pl.krajewski.euler.problems.utils.string.StringPower;

public class Problem030 extends Problem<Double> {

    private Integer powerIndex = 0;

    @Override
    public Double resolveProblem() {
        
        int power = getParameterForNumber(powerIndex);
        
        Map<Integer, Integer> mapWithPowers = new HashMap<Integer, Integer>();
        
        for(int number = 0; number < 10; number++) {
            String numberToPower = StringPower.getPowerForNumberBelow10(number, power);
            mapWithPowers.put(number, Integer.parseInt(numberToPower));
            System.out.println("NUMBER "+number+" - POWER "+power+" -- "+numberToPower);
        }
        
        Set<Integer> values = new HashSet<Integer>();
        int sum1, sum2, sum3, sum4, sum5;
        int val1, val2, val3, val4, val5, val6;
        for(int loop1=0; loop1<=9; loop1++) {
        	for(int loop2=0; loop2<=9; loop2++) {
        		
        		val1 = mapWithPowers.get(loop1);
        		val2 = mapWithPowers.get(loop2);
        		sum1 = val1 + val2;
        		List<Integer> tab1 = new ArrayList<Integer>();
        		tab1.add(loop1);
        		tab1.add(loop2);
				if(!values.contains(sum1) && isStringFromNumbers(sum1, tab1)) {
					System.out.println("ADD "+sum1+" -- TAB "+tab1);
					values.add(sum1);
        		}
        		
        		for(int loop3=0; loop3<=9; loop3++) {
        			val3 = mapWithPowers.get(loop3);
        			sum2 = sum1 + val3;
        			List<Integer> tab2 = new ArrayList<Integer>();
        			tab2.add(loop1);
        			tab2.add(loop2);
        			tab2.add(loop3);
        			if(!values.contains(sum2) && isStringFromNumbers(sum2, tab2)) {
        				System.out.println("ADD "+sum2+" -- TAB "+tab2);
        				values.add(sum2);
        			}
        			for(int loop4=0; loop4<=9; loop4++) {
        				val4 = mapWithPowers.get(loop4);
        				sum3 = sum2 + val4;
        				List<Integer> tab3 = new ArrayList<Integer>();
        				tab3.add(loop1);
        				tab3.add(loop2);
        				tab3.add(loop3);
        				tab3.add(loop4);
        				if(!values.contains(sum3) && isStringFromNumbers(sum3, tab3)) {
        					System.out.println("ADD "+sum3+" -- TAB "+tab3);
        					values.add(sum3);
        				}
        				for(int loop5=0; loop5<=9; loop5++) {
        					val5 = mapWithPowers.get(loop5);
        					sum4 = sum3 + val5;
        					List<Integer> tab4 = new ArrayList<Integer>();
        					tab4.add(loop1);
        					tab4.add(loop2);
        					tab4.add(loop3);
        					tab4.add(loop4);
        					tab4.add(loop5);
        					if(!values.contains(sum4) && isStringFromNumbers(sum4, tab4)) {
        						System.out.println("ADD "+sum4+" -- TAB "+tab4);
        						values.add(sum4);
        					}
        					for(int loop6=0; loop6<=9; loop6++) {
        						val6 = mapWithPowers.get(loop6);
        						sum5 = sum4 + val5;
        						List<Integer> tab5 = new ArrayList<Integer>();
        						tab5.add(loop1);
        						tab5.add(loop2);
        						tab5.add(loop3);
        						tab5.add(loop4);
        						tab5.add(loop5);
        						tab5.add(loop6);
        						if(!values.contains(sum5) && isStringFromNumbers(sum5, tab5)) {
        							System.out.println("ADD "+sum5+" -- TAB "+tab5);
        							values.add(sum5);
        						}
        					}
        				}
        			}
        		}
        	}
        }
        double sumOfNumbers = 0.0;
        
        for(Integer value : values) {
        	sumOfNumbers += value;
        }
        
        return sumOfNumbers;
    }
    
    private boolean isStringFromNumbers(int number, List<Integer> digits) {
    	if(digits == null) {
    		return false;
    	}
    	String numString = String.valueOf(number);
    	int length = digits.size();
    	if(length != numString.length()) {
    		return false;
    	}
    	
    	List<Integer> temp = new ArrayList<Integer>(digits);
    	for(int i=0; i<length; i++) {
    		int digit = Integer.parseInt(Character.toString(numString.charAt(i)));
    		int index = temp.indexOf(digit);
    		if(index == -1) {
    			return false;
    		}
    		temp.remove(index);
    	}
    	return temp.isEmpty();
    }
}
