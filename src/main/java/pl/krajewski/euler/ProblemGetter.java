package pl.krajewski.euler;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import pl.krajewski.euler.problems.implementations.problems031_040.Problem034;
import pl.krajewski.euler.problems.implementations.problems031_040.Problem035;
import pl.krajewski.euler.problems.implementations.problems031_040.Problem036;
import pl.krajewski.euler.problems.implementations.problems031_040.Problem037;
import pl.krajewski.euler.problems.implementations.problems031_040.Problem038;
import pl.krajewski.euler.problems.implementations.problems031_040.Problem039;
import pl.krajewski.euler.problems.implementations.problems031_040.Problem040;
import pl.krajewski.euler.problems.implementations.problems041_050.Problem042;
import pl.krajewski.euler.problems.implementations.problems111_120.Problem116;
import pl.krajewski.euler.problems.implementations.problems201_210.Problem205;
import pl.krajewski.euler.problems.implementations.problems201_210.Problem210;
import pl.krajewski.euler.problems.implementations.problems301_310.Problem304;

@SuppressWarnings("rawtypes")
public class ProblemGetter {

	private static Date startDate, stopDate;

	private static int MAX_PROBLEM_NUMBER = 344;

	private static Map<Integer, ProblemResolver> problems = new HashMap<Integer, ProblemResolver>();

	private static ProblemGetter instance;
	static {
		problems.put(1, new Problem001());
		problems.put(2, new Problem002());
		problems.put(3, new Problem003());
		problems.put(4, new Problem004());
		problems.put(5, new Problem005());
		problems.put(6, new Problem006());
		problems.put(7, new Problem007());
		problems.put(8, new Problem008());
		problems.put(9, new Problem009());
		problems.put(10, new Problem010());
		problems.put(11, new Problem011());
		problems.put(12, new Problem012());
		problems.put(13, new Problem013());
		problems.put(14, new Problem014());
		problems.put(15, new Problem015());
		problems.put(16, new Problem016());
		problems.put(17, new Problem017());
		problems.put(18, new Problem018());
		problems.put(19, new Problem019());
		problems.put(20, new Problem020());
		problems.put(21, new Problem021());
		problems.put(22, new Problem022());
		problems.put(23, new Problem023());
		problems.put(24, new Problem024());
		problems.put(25, new Problem025());
		problems.put(26, new Problem026());
		problems.put(27, new Problem027());
		problems.put(28, new Problem028());
		problems.put(29, new Problem029());
		problems.put(30, new Problem030());
		problems.put(31, new Problem031());
		problems.put(34, new Problem034());
		problems.put(35, new Problem035());
		problems.put(36, new Problem036());
		problems.put(37, new Problem037());
		problems.put(38, new Problem038());
		problems.put(39, new Problem039());
		problems.put(40, new Problem040());
		problems.put(42, new Problem042());
		problems.put(116, new Problem116());
		problems.put(205, new Problem205());
		problems.put(210, new Problem210());
		problems.put(304, new Problem304());
	}

	private ProblemGetter() {
	}

	public synchronized static ProblemGetter getInstance() {
		if (instance == null) {
			instance = new ProblemGetter();
		}
		return instance;
	}

	public ProblemResolver getProblemForNumber(Integer problemNumber) {
		return problems.get(problemNumber);
	}

	public Map<Integer, ProblemResolver> getProblems() {
		return problems;
	}

	public List<Integer> getProblemsToRandomize() {

		List<Integer> problemsToRandomize = new ArrayList<Integer>();
		for (int problemIndex = 1; problemIndex < MAX_PROBLEM_NUMBER; problemIndex++) {
			if (!problems.containsKey(problemIndex)) {
				problemsToRandomize.add(problemIndex);
			}
		}
		return problemsToRandomize;
	}

	public void resolveProblem(int problemNumber) {
		resolveAndPrintProblem(getProblemForNumber(problemNumber), problemNumber);
	}

	private static void resolveAndPrintProblem(ProblemResolver problemResolver, int number) {
		startDate = new Date();
		Object result = problemResolver.resolveProblem();
		stopDate = new Date();
		System.out.println(addTimeToResult(getResult(result, number),
				(stopDate.getTime() - startDate.getTime())));
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

		if (result instanceof String) {
			return (String) result;
		} else {
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
