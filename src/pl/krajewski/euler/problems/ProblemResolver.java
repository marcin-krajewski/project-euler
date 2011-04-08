package pl.krajewski.euler.problems;

public interface ProblemResolver<T> {

	public abstract T resolveProblem();
	public abstract T getCorrectProblemAnswer();
}
