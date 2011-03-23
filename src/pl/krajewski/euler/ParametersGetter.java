package pl.krajewski.euler;

import pl.krajewski.euler.problems.Parameters;

public class ParametersGetter {

	public static Parameters getParametersForNumber(int problemNumber) {
		switch(problemNumber) {
		case 1: return new Parameters(3,5,1000);
		case 2: return new Parameters(4000000);
		case 3: return new Parameters(new Double(600851475143.0));
		case 4: return new Parameters(3);
		case 5: return new Parameters(1.0, 20.0);
		case 6: return new Parameters(1.0, 100.0);
		case 7: return new Parameters(10001);
		case 8: return new Parameters("problem08.txt", 5);
		case 9: return new Parameters(1000);
		case 10: return new Parameters(2000000);
		case 11: return new Parameters("problem11.txt", 4);
		case 12: return new Parameters(500);
		case 13: return new Parameters("problem13.txt", 10, 50);
		case 14: return new Parameters(1000000.0);
		case 15: return new Parameters(20.0);
		case 16: return new Parameters(2, 1000);
		case 17: return new Parameters(1, 1000);
		}
		return null;
	}
}
