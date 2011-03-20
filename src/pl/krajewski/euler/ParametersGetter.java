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
		}
		return null;
	}
}
