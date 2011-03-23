package pl.krajewski.euler;

import pl.krajewski.euler.problems.utils.EnglishNumbersWordLength;
import pl.krajewski.euler.problems.utils.StringAsNum;


public class ProjectEuler {

	public static Integer problemCallNumber = 17;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProblemGetter.resolveProblem(problemCallNumber);
		print(EnglishNumbersWordLength.getStringForNumberBelow10000(115));
		print(EnglishNumbersWordLength.getNumberLen(115));
	}
	
	private static void print(Object a) {
		System.out.println("OBJECT "+a);
	}
	
	
}
