package pl.krajewski.euler;

import pl.krajewski.euler.problems.utils.StringAsNum;


public class ProjectEuler {

	public static Integer problemCallNumber = 16;
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
