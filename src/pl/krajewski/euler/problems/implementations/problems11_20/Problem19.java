package pl.krajewski.euler.problems.implementations.problems11_20;

import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.numbers.DateChecker;
import pl.krajewski.euler.problems.utils.numbers.DateChecker.DayOfWeek;
import pl.krajewski.euler.problems.utils.numbers.DateChecker.Month;

public class Problem19 extends Problem<Integer> {

	@Override
	public Integer resolveProblem() {
		int minYear = getParameterForNumber(0);
		int maxYear = getParameterForNumber(1);
		Integer dayOfMonth = getParameterForNumber(2);
		DayOfWeek day = getParameterForNumber(3);
		
		int countOfDays = 0;
		for(int year=minYear; year <= maxYear; year++) {
			for(Month m : Month.values()) {
				DayOfWeek dow = DateChecker.checkWhichDayWasDate(dayOfMonth, m, year);
				if(dow == day) {
					countOfDays++;
				}
			}
		}
		return countOfDays;
	}

}
