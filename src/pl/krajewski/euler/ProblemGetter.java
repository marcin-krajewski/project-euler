package pl.krajewski.euler;

import java.text.DecimalFormat;
import java.util.Date;
import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.ProblemResolver;
import pl.krajewski.euler.problems.implementations.problems001_010.Problem001;
import pl.krajewski.euler.problems.implementations.problems001_010.Problem002;
import pl.krajewski.euler.problems.implementations.problems001_010.Problem003;
import pl.krajewski.euler.problems.implementations.problems001_010.Problem004;
import pl.krajewski.euler.problems.implementations.problems001_010.Problem005;
import pl.krajewski.euler.problems.implementations.problems001_010.Problem006;
import pl.krajewski.euler.problems.implementations.problems001_010.Problem007;
import pl.krajewski.euler.problems.implementations.problems001_010.Problem008;
import pl.krajewski.euler.problems.implementations.problems001_010.Problem009;
import pl.krajewski.euler.problems.implementations.problems001_010.Problem010;
import pl.krajewski.euler.problems.implementations.problems011_020.Problem011;
import pl.krajewski.euler.problems.implementations.problems011_020.Problem012;
import pl.krajewski.euler.problems.implementations.problems011_020.Problem013;
import pl.krajewski.euler.problems.implementations.problems011_020.Problem014;
import pl.krajewski.euler.problems.implementations.problems011_020.Problem015;
import pl.krajewski.euler.problems.implementations.problems011_020.Problem016;
import pl.krajewski.euler.problems.implementations.problems011_020.Problem017;
import pl.krajewski.euler.problems.implementations.problems011_020.Problem018;
import pl.krajewski.euler.problems.implementations.problems011_020.Problem019;
import pl.krajewski.euler.problems.implementations.problems011_020.Problem020;
import pl.krajewski.euler.problems.implementations.problems021_030.Problem021;
import pl.krajewski.euler.problems.implementations.problems021_030.Problem022;
import pl.krajewski.euler.problems.implementations.problems021_030.Problem023;
import pl.krajewski.euler.problems.implementations.problems021_030.Problem024;
import pl.krajewski.euler.problems.implementations.problems021_030.Problem025;
import pl.krajewski.euler.problems.implementations.problems021_030.Problem026;
import pl.krajewski.euler.problems.implementations.problems021_030.Problem027;
import pl.krajewski.euler.problems.implementations.problems021_030.Problem028;
import pl.krajewski.euler.problems.implementations.problems021_030.Problem029;
import pl.krajewski.euler.problems.implementations.problems021_030.Problem030;
import pl.krajewski.euler.problems.implementations.problems031_040.Problem031;
import pl.krajewski.euler.problems.implementations.problems031_040.Problem032;
import pl.krajewski.euler.problems.implementations.problems031_040.Problem033;


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
			case 1: return new Problem001();
			case 2: return new Problem002();
			case 3: return new Problem003();
			case 4: return new Problem004();
			case 5: return new Problem005();
			case 6: return new Problem006();
			case 7: return new Problem007();
			case 8: return new Problem008();
			case 9: return new Problem009();
			case 10: return new Problem010();
			case 11: return new Problem011();
			case 12: return new Problem012();
			case 13: return new Problem013();
			case 14: return new Problem014();
			case 15: return new Problem015();
			case 16: return new Problem016();
			case 17: return new Problem017();
			case 18: return new Problem018();
			case 19: return new Problem019();
			case 20: return new Problem020();
			case 21: return new Problem021();
			case 22: return new Problem022();
			case 23: return new Problem023();
			case 24: return new Problem024();
			case 25: return new Problem025();
			case 26: return new Problem026();
			case 27: return new Problem027();
			case 28: return new Problem028();
			case 29: return new Problem029();
			case 30: return new Problem030();
			case 31: return new Problem031();
			case 32: return new Problem032();
			case 33: return new Problem033();
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
