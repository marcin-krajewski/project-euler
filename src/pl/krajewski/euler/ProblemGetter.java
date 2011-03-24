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
import pl.krajewski.euler.problems.implementations.problems_11_20.Problem15;
import pl.krajewski.euler.problems.implementations.problems_11_20.Problem16;
import pl.krajewski.euler.problems.implementations.problems_11_20.Problem17;
import pl.krajewski.euler.problems.implementations.problems_11_20.Problem18;


public class ProblemGetter {

	private static Date startDate, stopDate;
	public static ProblemResolver getProblemForNumber(int problemNumber) {
		Parameters parameters = ParametersGetter.getParametersForNumber(problemNumber);
		ProblemResolver problemResolver = getProblemResolverForNumber(problemNumber);
		problemResolver.setParameters(parameters);
		return problemResolver;
	}
	
	private static ProblemResolver getProblemResolverForNumber(Integer problemNumber) {
		
		switch(problemNumber) {
			case 1: return new Problem01();
			case 2: return new Problem02();
			case 3: return new Problem03();
			case 4: return new Problem04();
			case 5: return new Problem05();
			case 6: return new Problem06();
			case 7: return new Problem07();
			case 8: return new Problem08();
			case 9: return new Problem09();
			case 10: return new Problem10();
			case 11: return new Problem11();
			case 12: return new Problem12();
			case 13: return new Problem13();
			case 14: return new Problem14();
			case 15: return new Problem15();
			case 16: return new Problem16();
			case 17: return new Problem17();
			case 18: return new Problem18();
			default: return null;
		}
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
		sb.append(getFormattedResult(result));
		return sb.toString();
	}
	
	public static String getFormattedResult(Object result) {
	    
	    if(result instanceof String) {
	        return (String)result;
	    }
	    else {
	        return (new DecimalFormat("0")).format(result);
	    }
	}
	
	private static String addTimeToResult(String result, Long timeMillis) {
		StringBuilder sb = new StringBuilder(result);
		sb.append(" --- TIME: ");
		sb.append(timeMillis);
		return sb.toString();
	}
	
	public static String getProblemResultForProblemNumber(Integer problemNumberToCheck) {
	        
        if(problemNumberToCheck == null) {
            return null;
        }
        
        switch(problemNumberToCheck) {
            case 1: return "233168";
            case 2: return "4613732";
            case 3: return "6857";
            case 4: return "906609";
            case 5: return "232792560";
            case 6: return "25164150";
            case 7: return "104743";
            case 8: return "40824";
            case 9: return "31875000";
            case 10: return "142913828922";
            case 11: return "70600674";
            case 12: return "76576500";
            case 13: return "5537376230";
            case 14: return "837799";
            case 15: return "137846528820";
            case 16: return "1366";
            case 17: return "21124";
        }
        
        return "";
    }
}
