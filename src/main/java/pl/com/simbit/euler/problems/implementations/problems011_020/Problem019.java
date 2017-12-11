package pl.com.simbit.euler.problems.implementations.problems011_020;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.numbers.DateChecker;

public class Problem019 extends Problem<Integer> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1901, 2000, 1, DateChecker.DayOfWeek.SUN);
	}

	@Override
	public Integer resolveProblem() {
		Integer minYear = getParameterForNumber(0);
		Integer maxYear = getParameterForNumber(1);
		Integer dayOfMonth = getParameterForNumber(2);
		DateChecker.DayOfWeek day = getParameterForNumber(3);

		int countOfDays = 0;
		for (int year = minYear; year <= maxYear; year++) {
			for (DateChecker.Month m : DateChecker.Month.values()) {
				DateChecker.DayOfWeek dow = DateChecker.checkWhichDayWasDate(dayOfMonth, m, year);
				if (dow == day) {
					countOfDays++;
				}
			}
		}
		return countOfDays;
	}

	@Override
	public Integer getCorrectProblemAnswer() {
		return 171;
	}

}
