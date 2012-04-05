package pl.krajewski.euler;

import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProblemNumberToSolveGenerator {
	
	private static Logger logger = LoggerFactory.getLogger(ProblemNumberToSolveGenerator.class);

	private static int lastToSolve = 42;
	private static boolean lastSolved = false;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		logger.info("PROBLEM NUMBER TO SOLVE: " + getNumberToSolve());
	}

	private static int getNumberToSolve() {
		if (lastSolved) {
			List<Integer> problemsToRandomize = ProblemGetter.getInstance().getProblemsToRandomize();
			int nextInt = new Random().nextInt(problemsToRandomize.size() - 1);
			return problemsToRandomize.get(nextInt);
		}

		return lastToSolve;
	}

}
