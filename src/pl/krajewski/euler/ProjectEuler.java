package pl.krajewski.euler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import pl.krajewski.euler.problems.utils.math.Permutations;
import pl.krajewski.euler.problems.utils.math.RecurringCycle;
import pl.krajewski.euler.problems.utils.string.Factorial;



public class ProjectEuler {

	public static Integer problemCallNumber = 210;
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
