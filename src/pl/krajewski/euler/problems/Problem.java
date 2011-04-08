package pl.krajewski.euler.problems;

import static org.junit.Assert.*;

import org.junit.Test;

public abstract class Problem<T> implements ProblemResolver<T> {

	private Parameters parameters;
	
	protected <S> S getParameterForNumber(Integer number) {
		return (S)this.parameters.getParameterForNumber(number);
	}
	
	public Problem() {
	    this.parameters = getParametersForProblem();
    }

    protected abstract Parameters getParametersForProblem();
    
    @Test
    public void testIfProblemIsCorrect() {
        assertEquals(this.getCorrectProblemAnswer(), this.resolveProblem());
    }
}
