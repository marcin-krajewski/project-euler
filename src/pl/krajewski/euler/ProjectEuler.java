package pl.krajewski.euler;

import pl.krajewski.euler.problems.utils.math.RecurringCycle;



public class ProjectEuler {

	public static Integer problemCallNumber = 26;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProblemGetter.resolveProblem(problemCallNumber);
	}
	
	private static void print(Object a) {
		System.out.println("OBJECT "+a);
	}
	
	
}
