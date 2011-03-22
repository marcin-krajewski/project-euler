package pl.krajewski.euler.problems.utils;

public class CollatzSequence {

	public static double numberOfSteps(double number) {
		
		double steps = 1.0;
		if(number <= 1.0) {
			return steps;
		}
		
		while(true) {
			if(number%2 == 1) {
				number = 1.5*number+0.5;
				steps++;
			}
			else {
				number = number*0.5;
				steps++;
				if(number == 1.0) {
					break;
				}
			}
		}
		
		return steps;
	}
}
