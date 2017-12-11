package pl.com.simbit.euler;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.com.simbit.euler.problems.ProblemResolver;

@SuppressWarnings("rawtypes")
public class ProblemGetter {

	public static final String PACKAGE_PREFIX = ProblemGetter.class.getPackage().getName()
			+ ".problems.implementations.problems";

	private static Logger logger = LoggerFactory.getLogger(ProblemGetter.class);

	private static Date startDate, stopDate;

	private static int MAX_PROBLEM_NUMBER = 50;

	private static ProblemGetter instance;

	private ProblemGetter() {
	}

	public synchronized static ProblemGetter getInstance() {
		if (instance == null) {
			try {
				instance = new ProblemGetter();
			} catch (Exception ex) {
				throw new RuntimeException(ex);
			}
		}
		return instance;
	}

	@SuppressWarnings("unchecked")
	public ProblemResolver getProblemForNumber(Integer problemNumber) {
		try {
			String p = getPackageNameForProblemNumber(problemNumber);
			Class problemImpl = Class.forName(p + "." + "Problem" + formatNumberWith3LeadingZeros(problemNumber));
			return (ProblemResolver) problemImpl.getConstructor().newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public Map<Integer, ProblemResolver> getProblems() {
		Map<Integer, ProblemResolver> problems = new LinkedHashMap<Integer, ProblemResolver>();
		for (int problemNumber = 1; problemNumber < MAX_PROBLEM_NUMBER; problemNumber++) {
			try {
				problems.put(problemNumber, getProblemForNumber(problemNumber));
			} catch (Exception ex) {
				logger.info("No problem for number: {}", new Object[] { problemNumber });
			}
		}
		logger.info("Problems size: {}", new Object[] { problems.size() });
		return problems;
	}

	public List<Integer> getProblemsToRandomize() {

		List<Integer> problemsToRandomize = new ArrayList<Integer>();
		for (int problemIndex = 1; problemIndex < MAX_PROBLEM_NUMBER; problemIndex++) {
			if (!getProblems().containsKey(problemIndex)) {
				problemsToRandomize.add(problemIndex);
			}
		}
		return problemsToRandomize;
	}

	public void resolveProblem(int problemNumber) {
		resolveAndPrintProblem(getProblemForNumber(problemNumber), problemNumber);
	}

	private void resolveAndPrintProblem(ProblemResolver problemResolver, int number) {
		startDate = new Date();
		Object result = problemResolver.resolveProblem();
		stopDate = new Date();
		logger.info(addTimeToResult(getResult(result, number), (stopDate.getTime() - startDate.getTime())));
	}

	private String getResult(Object result, int problemCallNumber) {
		StringBuilder sb = new StringBuilder();
		sb.append("RESULT FOR NUMBER: ");
		sb.append(problemCallNumber);
		sb.append(" IS ");
		sb.append(getFormattedResult(result));
		return sb.toString();
	}

	public String getFormattedResult(Object result) {

		if (result instanceof String) {
			return (String) result;
		} else {
			return (new DecimalFormat("0")).format(result);
		}
	}

	private String addTimeToResult(String result, Long timeMillis) {
		StringBuilder sb = new StringBuilder(result);
		sb.append(" --- TIME: ");
		sb.append(timeMillis);
		return sb.toString();
	}

	public String getPackageNameForProblemNumber(int problemNumber) {
		int modulo = (problemNumber - 1) / 10;
		return ProblemGetter.PACKAGE_PREFIX + formatNumberWith3LeadingZeros(modulo * 10 + 1) + "_"
				+ formatNumberWith3LeadingZeros((modulo + 1) * 10);
	}

	private String formatNumberWith3LeadingZeros(int number) {
		return String.format("%03d", number);
	}
}
