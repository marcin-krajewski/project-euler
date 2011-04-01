package pl.krajewski.euler;

import pl.krajewski.euler.problems.utils.math.Permutations;
import pl.krajewski.euler.problems.utils.math.RecurringCycle;
import pl.krajewski.euler.problems.utils.string.Factorial;



public class ProjectEuler {

	public static Integer problemCallNumber = 15;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProblemGetter.resolveProblem(problemCallNumber);
		Permutations.createPermutations();
	}
	
	private static void print(Object a) {
		System.out.println("OBJECT "+a);
	}
	
	
}
