package pl.krajewski.euler;

import pl.krajewski.euler.problems.utils.DateChecker;
import pl.krajewski.euler.problems.utils.EnglishNumbersWordLength;
import pl.krajewski.euler.problems.utils.Factorial;
import pl.krajewski.euler.problems.utils.StringAsNum;
import pl.krajewski.euler.problems.utils.StringPower;
import pl.krajewski.euler.problems.utils.DateChecker.Month;


public class ProjectEuler {

	public static Integer problemCallNumber = 20;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProblemGetter.resolveProblem(problemCallNumber);
//		print(Factorial.factorial(10));
	}
	
	private static void print(Object a) {
		System.out.println("OBJECT "+a);
	}
	
	
}
