package pl.krajewski.euler;

import pl.krajewski.euler.problems.utils.PrimeNumbers;




public class ProjectEuler {

	
	private static Integer problemCallNumber = 7;
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
