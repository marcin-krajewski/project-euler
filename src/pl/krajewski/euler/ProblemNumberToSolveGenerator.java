package pl.krajewski.euler;

import java.util.List;
import java.util.Random;

public class ProblemNumberToSolveGenerator {
	
	private static int lastToSolve = 304;
	private static boolean lastSolved = false;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("PROBLEM NUMBER TO SOLVE: " + getNumberToSolve());
	}
	
	private static int getNumberToSolve() {
		if(lastSolved) {
			List<Integer> problemsToRandomize = ProblemGetter.getProblemsToRandomize();
			int nextInt = new Random().nextInt(problemsToRandomize.size()-1);
			return problemsToRandomize.get(nextInt);
		} 
		
		return lastToSolve;
	}

}
