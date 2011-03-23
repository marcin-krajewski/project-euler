package pl.krajewski.euler.problems.implementations.problems_11_20;

import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.StringAsNum;
import pl.krajewski.euler.problems.utils.StringPower;

public class Problem16 extends Problem<Integer> {

	@Override
	public Integer resolveProblem() {
		int number = getParameterForNumber(0);
		int powNumber = getParameterForNumber(1);
		
		int sum = 0;
		
		String stringPow = StringPower.getPowerForNumberBelow10(number, powNumber);
		int[] numbers = StringAsNum.getStringAsNumArray0IsLowerMaxIsHigher(stringPow);
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		
		System.out.println("STRING "+stringPow);
		return sum;
	}
	
	

}
