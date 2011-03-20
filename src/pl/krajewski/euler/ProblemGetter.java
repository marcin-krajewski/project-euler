package pl.krajewski.euler;

import java.util.Date;
import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.ProblemResolver;
import pl.krajewski.euler.problems.implementations.Problem1;
import pl.krajewski.euler.problems.implementations.Problem2;
import pl.krajewski.euler.problems.implementations.Problem3;


public class ProblemGetter {

	private static Date startDate, stopDate;
	private static ProblemResolver getProblemForNumber(int problemNumber) {
		Parameters parameters = getParametersForNumber(problemNumber);
		if(problemNumber == 1) {
			return new Problem1(parameters);
		}
		else if(problemNumber == 2) {
			return new Problem2(parameters);
		}
		else if(problemNumber == 3) {
			return new Problem3(parameters);
		}
		return null;
	}

	private static Parameters getParametersForNumber(int problemNumber) {
		if(problemNumber == 1) {
			return new Parameters(3,5,1000);
		}
		else if(problemNumber == 2) {
			return new Parameters(4000000);
		}
		else if(problemNumber == 3) {
			return new Parameters(new Double(600851475143.0));
		}
		return null;
	}
	
	public static void resolveProblem(int problemNumber) {
		resolveAndPrintProblem(getProblemForNumber(problemNumber), problemNumber);
	}
	
	private static void resolveAndPrintProblem(ProblemResolver problemResolver, int number) {
		startDate = new Date();
		Object result = problemResolver.resolveProblem();
		stopDate = new Date();
		System.out.println(addTimeToResult(getResult(result, number), (stopDate.getTime() - startDate.getTime())));
	}

	private static String getResult(Object result, int problemCallNumber) {
		StringBuilder sb = new StringBuilder();
		sb.append("RESULT FOR NUMBER: ");
		sb.append(problemCallNumber);
		sb.append(" IS ");
		sb.append(result);
		return sb.toString();
	}
	
	private static String addTimeToResult(String result, Long timeMillis) {
		StringBuilder sb = new StringBuilder(result);
		sb.append(" --- TIME: ");
		sb.append(timeMillis);
		return sb.toString();
	}
}
