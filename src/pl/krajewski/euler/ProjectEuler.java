package pl.krajewski.euler;

import pl.krajewski.euler.problems.utils.DateChecker;
import pl.krajewski.euler.problems.utils.EnglishNumbersWordLength;
import pl.krajewski.euler.problems.utils.StringAsNum;
import pl.krajewski.euler.problems.utils.StringPower;
import pl.krajewski.euler.problems.utils.DateChecker.Month;


public class ProjectEuler {

	public static Integer problemCallNumber = 19;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProblemGetter.resolveProblem(problemCallNumber);
//		print(DateChecker.checkWhichDayWasDate(29, Month.NOV, 1986));
//		print(StringPower.getPowerForNumberBelow10(12, 12));
	}
	
	private static void print(Object a) {
		System.out.println("OBJECT "+a);
	}
	
	
}
