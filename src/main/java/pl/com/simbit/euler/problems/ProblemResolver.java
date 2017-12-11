package pl.com.simbit.euler.problems;

public interface ProblemResolver<T> {

	public T resolveProblem();

	public T getCorrectProblemAnswer();
}
