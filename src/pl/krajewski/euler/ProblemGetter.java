package pl.krajewski.euler;

import java.text.DecimalFormat;
import java.util.Date;
import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.ProblemResolver;
import pl.krajewski.euler.problems.implementations.problems01_10.Problem01;
import pl.krajewski.euler.problems.implementations.problems01_10.Problem02;
import pl.krajewski.euler.problems.implementations.problems01_10.Problem03;
import pl.krajewski.euler.problems.implementations.problems01_10.Problem04;
import pl.krajewski.euler.problems.implementations.problems01_10.Problem05;
import pl.krajewski.euler.problems.implementations.problems01_10.Problem06;
import pl.krajewski.euler.problems.implementations.problems01_10.Problem07;
import pl.krajewski.euler.problems.implementations.problems01_10.Problem08;
import pl.krajewski.euler.problems.implementations.problems01_10.Problem09;
import pl.krajewski.euler.problems.implementations.problems01_10.Problem10;
import pl.krajewski.euler.problems.implementations.problems11_20.Problem11;
import pl.krajewski.euler.problems.implementations.problems11_20.Problem12;
import pl.krajewski.euler.problems.implementations.problems11_20.Problem13;
import pl.krajewski.euler.problems.implementations.problems11_20.Problem14;
import pl.krajewski.euler.problems.implementations.problems11_20.Problem15;
import pl.krajewski.euler.problems.implementations.problems11_20.Problem16;
import pl.krajewski.euler.problems.implementations.problems11_20.Problem17;
import pl.krajewski.euler.problems.implementations.problems11_20.Problem18;
import pl.krajewski.euler.problems.implementations.problems11_20.Problem19;
import pl.krajewski.euler.problems.implementations.problems11_20.Problem20;
import pl.krajewski.euler.problems.implementations.problems21_30.Problem21;
import pl.krajewski.euler.problems.implementations.problems21_30.Problem22;
import pl.krajewski.euler.problems.implementations.problems21_30.Problem23;
import pl.krajewski.euler.problems.implementations.problems21_30.Problem24;
import pl.krajewski.euler.problems.implementations.problems21_30.Problem25;
import pl.krajewski.euler.problems.implementations.problems21_30.Problem26;
import pl.krajewski.euler.problems.implementations.problems21_30.Problem27;
import pl.krajewski.euler.problems.implementations.problems21_30.Problem28;
import pl.krajewski.euler.problems.implementations.problems21_30.Problem29;


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
			case 19: return new Problem19();
			case 20: return new Problem20();
			case 21: return new Problem21();
			case 22: return new Problem22();
			case 23: return new Problem23();
			case 24: return new Problem24();
			case 25: return new Problem25();
			case 26: return new Problem26();
			case 27: return new Problem27();
			case 28: return new Problem28();
			case 29: return new Problem29();
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
}
