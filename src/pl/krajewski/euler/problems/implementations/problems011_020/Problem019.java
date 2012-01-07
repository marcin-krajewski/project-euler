package pl.krajewski.euler.problems.implementations.problems011_020;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.numbers.DateChecker;
import pl.krajewski.euler.problems.utils.numbers.DateChecker.DayOfWeek;
import pl.krajewski.euler.problems.utils.numbers.DateChecker.Month;

public class Problem019 extends Problem<Integer> {

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1901, 2000, 1, DayOfWeek.SUN);
	}

	@Override
	public Integer resolveProblem() {
		Integer minYear = getParameterForNumber(0);
		Integer maxYear = getParameterForNumber(1);
		Integer dayOfMonth = getParameterForNumber(2);
		DayOfWeek day = getParameterForNumber(3);

		int countOfDays = 0;
		for (int year = minYear; year <= maxYear; year++) {
			for (Month m : Month.values()) {
				DayOfWeek dow = DateChecker.checkWhichDayWasDate(dayOfMonth, m, year);
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
