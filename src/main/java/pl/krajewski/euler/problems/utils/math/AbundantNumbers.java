package pl.krajewski.euler.problems.utils.math;

public class AbundantNumbers {

	public static final boolean isAbundant(Integer number) {
		return PrimeFactor.countOfFactorsWithoutNumber(number) > number;
	}
}
