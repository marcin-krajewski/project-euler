package pl.krajewski.euler.problems;

public abstract class Problem<T> implements ProblemResolver<T> {

	private Parameters parameters;
	
	protected <S> S getParameterForNumber(Integer number) {
		return (S)this.parameters.getParameterForNumber(number);
	}
	
	@Override
	public void setParameters(Parameters parameters) {
		this.parameters = parameters;
	}
}
