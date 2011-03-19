package pl.krajewski.euler;

import java.util.Date;
import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem1;
import pl.krajewski.euler.problems.ProblemResolver;


public class ProjectEuler {

	
	private static Integer problemCallNumber = 1;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProblemGetter.resolveProblem(problemCallNumber);
	}
	
	
}
