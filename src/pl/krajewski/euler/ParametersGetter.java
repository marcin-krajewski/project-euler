package pl.krajewski.euler;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.utils.numbers.DateChecker.DayOfWeek;

public class ParametersGetter {

	public static Parameters getParametersForNumber(int problemNumber) {
		switch(problemNumber) {
			case 1: return new Parameters(3,5,1000);
			case 2: return new Parameters(4000000);
			case 3: return new Parameters(600851475143.0);
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
			case 18: return new Parameters("problem18.txt");
			case 19: return new Parameters(1901, 2000, 1, DayOfWeek.SUN);
			case 20: return new Parameters(100);
			case 21: return new Parameters(10000);
			case 22: return new Parameters("problem22.txt", ",");
			case 23: return new Parameters(28123);
			case 24: return new Parameters(getMapForProblem24(), 1000000);
			case 25: return new Parameters(1000);
			case 26: return new Parameters(1000);
			case 27: return new Parameters(1000, 1000);
			case 28: return new Parameters(1001);
			case 29: return new Parameters(2, 100, 2, 100);
			case 30: return new Parameters(5);
			case 31: return new Parameters(getCoinsForProblem31(), 200);
			case 32: return new Parameters(1, 9);
		}
		return null;
	}

	private static Map<Integer, String> getMapForProblem24() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "0");
		map.put(2, "1");
		map.put(3, "2");
		map.put(4, "3");
		map.put(5, "4");
		map.put(6, "5");
		map.put(7, "6");
		map.put(8, "7");
		map.put(9, "8");
		map.put(10, "9");
		return map;
	}
	
	private static Set<Integer> getCoinsForProblem31() {
		Set<Integer> coins = new HashSet<Integer>();
		coins.add(1);
		coins.add(2);
		coins.add(5);
		coins.add(10);
		coins.add(20);
		coins.add(50);
		coins.add(100);
		coins.add(200);
		return coins;
	}
}
