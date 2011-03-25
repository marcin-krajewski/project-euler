package pl.krajewski.euler;

import pl.krajewski.euler.problems.utils.numbers.DateChecker;
import pl.krajewski.euler.problems.utils.numbers.DateChecker.Month;
import pl.krajewski.euler.problems.utils.string.EnglishNumbersWordLength;
import pl.krajewski.euler.problems.utils.string.Factorial;
import pl.krajewski.euler.problems.utils.string.StringAsNum;
import pl.krajewski.euler.problems.utils.string.StringPower;


public class ProjectEuler {

	public static Integer problemCallNumber = 23;
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
