package pl.krajewski;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Before;
import org.junit.Test;

import pl.krajewski.euler.ProblemGetter;
import pl.krajewski.euler.problems.ProblemResolver;

public class CheckAllProblemsResultTest {

	private Map<Integer, Long> callTimes;

	@Before
	public void init() {
		callTimes = new HashMap<Integer, Long>();
	}

	@Test
	public void checkIfAllTestsReturnsNotNullAndCorrectResult() {

		ProblemResolver problemResolver;
		Object problemResult;
		Object expectedProblemResult;
		Date start, end;
		for (Entry<Integer, ProblemResolver> entry : ProblemGetter.getInstance().getProblems().entrySet()) {
			Integer problemNumberToCheck = entry.getKey();
			System.out.println("CHECKING PROBLEM NUMBER " + problemNumberToCheck);
			problemResolver = entry.getValue();

			expectedProblemResult = problemResolver.getCorrectProblemAnswer();
			if (expectedProblemResult == null) {
				System.out.println("\tNO ANSWER FOR PROBLEM " + problemNumberToCheck);
				continue;
			}

			start = new Date();
			problemResult = problemResolver.resolveProblem();
			end = new Date();

			assertNotNull(problemResult);
			assertEquals(expectedProblemResult, problemResult);

			callTimes.put(problemNumberToCheck, end.getTime() - start.getTime());

			System.out.println("\t TEST SUCCESS");
		}
		printTimes();
	}

	private void printTimes() {
		for (Integer number : callTimes.keySet()) {
			System.out.println("NUMBER: " + number + " -- TIME: "
					+ (new DecimalFormat("0.000")).format((double) callTimes.get(number) / 1000.0) + "s");
		}
	}
}