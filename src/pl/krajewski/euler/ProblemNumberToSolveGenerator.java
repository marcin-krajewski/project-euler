package pl.krajewski.euler;

import java.util.Random;
import java.util.Set;

public class ProblemNumberToSolveGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Integer> problemsToRandomize = ProblemGetter.getProblemsToRandomize();
		
		int problemNumber = new Random().nextInt(problemsToRandomize.size()-1) + 1;
		
		System.out.println("PROBLEM NUMBER TO SOLVE: " + problemNumber);
	}

}
