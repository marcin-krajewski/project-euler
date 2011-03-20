package pl.krajewski.euler;

import java.text.DecimalFormat;
import java.util.Date;
import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.ProblemResolver;
import pl.krajewski.euler.problems.implementations.*;


public class ProblemGetter {

	private static Date startDate, stopDate;
	private static ProblemResolver getProblemForNumber(int problemNumber) {
		Parameters parameters = ParametersGetter.getParametersForNumber(problemNumber);
		switch(problemNumber) {
		case 1: return new Problem1(parameters);
		case 2: return new Problem2(parameters);
		case 3: return new Problem3(parameters);
		case 4: return new Problem4(parameters);
		case 5: return new Problem5(parameters);
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
		sb.append((new DecimalFormat("0")).format(result));
		return sb.toString();
	}
	
	private static String addTimeToResult(String result, Long timeMillis) {
		StringBuilder sb = new StringBuilder(result);
		sb.append(" --- TIME: ");
		sb.append(timeMillis);
		return sb.toString();
	}
}
