package pl.krajewski.euler;

import pl.krajewski.euler.problems.utils.math.FibonacciSequence;


public class ProjectEuler {

	public static Integer problemCallNumber = 25;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProblemGetter.resolveProblem(problemCallNumber);
//		for(int i=1; i<=30; i++) {
//			print(FibonacciSequence.findFibonacciStringForIndex(i));
//		}
	}
	
	private static void print(Object a) {
		System.out.println("OBJECT "+a);
	}
	
	
}
