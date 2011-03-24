package pl.krajewski.euler;

import pl.krajewski.euler.problems.utils.EnglishNumbersWordLength;
import pl.krajewski.euler.problems.utils.StringAsNum;
import pl.krajewski.euler.problems.utils.StringPower;


public class ProjectEuler {

	public static Integer problemCallNumber = 18;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProblemGetter.resolveProblem(problemCallNumber);
//		print(StringPower.getPowerForNumberBelow10(12, 12));
	}
	
	private static void print(Object a) {
		System.out.println("OBJECT "+a);
	}
	
	
}
