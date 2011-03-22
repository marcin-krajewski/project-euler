package pl.krajewski.euler;

import java.text.DecimalFormat;
import java.util.Date;
import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.ProblemResolver;
import pl.krajewski.euler.problems.implementations.*;
import pl.krajewski.euler.problems.implementations.problems01_10.*;
import pl.krajewski.euler.problems.implementations.problems_11_20.Problem11;
import pl.krajewski.euler.problems.implementations.problems_11_20.Problem12;
import pl.krajewski.euler.problems.implementations.problems_11_20.Problem13;
import pl.krajewski.euler.problems.implementations.problems_11_20.Problem14;


public class ProblemGetter {

	private static Date startDate, stopDate;
	private static ProblemResolver getProblemForNumber(int problemNumber) {
		Parameters parameters = ParametersGetter.getParametersForNumber(problemNumber);
		switch(problemNumber) {
		case 1: return new Problem01(parameters);
		case 2: return new Problem02(parameters);
		case 3: return new Problem03(parameters);
		case 4: return new Problem04(parameters);
		case 5: return new Problem05(parameters);
		case 6: return new Problem06(parameters);
		case 7: return new Problem07(parameters);
		case 8: return new Problem08(parameters);
		case 9: return new Problem09(parameters);
		case 10: return new Problem10(parameters);
		case 11: return new Problem11(parameters);
		case 12: return new Problem12(parameters);
		case 13: return new Problem13(parameters);
		case 14: return new Problem14(parameters);
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
		if(result instanceof String) {
		    sb.append(result);
		}
		else {
		    sb.append((new DecimalFormat("0")).format(result));
		}
		return sb.toString();
	}
	
	private static String addTimeToResult(String result, Long timeMillis) {
		StringBuilder sb = new StringBuilder(result);
		sb.append(" --- TIME: ");
		sb.append(timeMillis);
		return sb.toString();
	}
}
