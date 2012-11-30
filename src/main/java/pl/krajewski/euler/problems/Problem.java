package pl.krajewski.euler.problems;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.krajewski.euler.ProjectEuler;

public abstract class Problem<T> implements ProblemResolver<T> {

	protected Logger logger = LoggerFactory.getLogger(getClass());

	protected Parameters parameters;

	@SuppressWarnings("unchecked")
	protected <S> S getParameterForNumber(Integer number) {
		return (S) this.parameters.getParameterForNumber(number);
	}

	public Problem() {
		this.parameters = getParametersForProblem();
	}

	public abstract T getCorrectProblemAnswer();

	public abstract T resolveProblem();

	protected abstract Parameters getParametersForProblem();

	@Test
	public void checkAllAnswers() {
		Map<Parameters, T> answers = getTestAnswers();
		for (Parameters parameters : answers.keySet()) {
			this.parameters = parameters;
			T value = this.resolveProblem();
			logger.info("CHECKING " + value + " FOR " + parameters);
			assertEquals(answers.get(parameters), value);
		}
	}

	@Test
	public final void testIfProblemIsCorrect() {
		Date d1 = new Date();
		T resolveProblem = this.resolveProblem();
		Date d2 = new Date();
		logger.info("*** FULL CHECKING " + getCorrectProblemAnswer() + " FOR " + resolveProblem + "; Time: "
				+ (d2.getTime() - d1.getTime()) + "ms");
		assertEquals(this.getCorrectProblemAnswer(), resolveProblem);
	}

	protected Map<Parameters, T> getTestAnswers() {
		return new HashMap<Parameters, T>();
	}
}
