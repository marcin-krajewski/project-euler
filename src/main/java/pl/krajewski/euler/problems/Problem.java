package pl.krajewski.euler.problems;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public abstract class Problem<T> implements ProblemResolver<T> {

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
			System.out.println("CHECKING " + value + " FOR " + parameters);
			assertEquals(answers.get(parameters), value);
		}
	}

	@Test
	public final void testIfProblemIsCorrect() {
		T resolveProblem = this.resolveProblem();
		System.out.println("*** FULL CHECKING " + getCorrectProblemAnswer()
				+ " FOR " + resolveProblem);
		assertEquals(this.getCorrectProblemAnswer(), resolveProblem);
	}

	protected Map<Parameters, T> getTestAnswers() {
		return new HashMap<Parameters, T>();
	}
}
