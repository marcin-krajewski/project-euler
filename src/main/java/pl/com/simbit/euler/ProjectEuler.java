package pl.com.simbit.euler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectEuler {

	private static Logger logger = LoggerFactory.getLogger(ProjectEuler.class);

	public static Integer problemCallNumber = 52;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProblemGetter.getInstance().resolveProblem(problemCallNumber);
	}

	@SuppressWarnings("unused")
	private static void print(Object a) {
		logger.info("Object " + a);
	}

}
