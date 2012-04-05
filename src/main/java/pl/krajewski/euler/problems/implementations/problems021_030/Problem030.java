package pl.krajewski.euler.problems.implementations.problems021_030;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.string.StringPower;

public class Problem030 extends Problem<Double> {

	private final Integer powerIndex = 0;

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(5);
	}

	@Override
	public Double resolveProblem() {

		Integer power = getParameterForNumber(powerIndex);

		Map<Integer, Integer> mapWithPowers = new HashMap<Integer, Integer>();

		for (int number = 0; number < 10; number++) {
			String numberToPower = StringPower.getPowerForNumberBelow10(number, power);
			mapWithPowers.put(number, Integer.parseInt(numberToPower));
			// System.out.println("NUMBER "+number+" - POWER "+power+" -- "+numberToPower);
		}

		int level = 1;
		int maxNumberToPower = mapWithPowers.get(9);
		while (true) {
			int result = maxNumberToPower * level;
			if (String.valueOf(result).length() < level) {
				level--;
				break;
			}
			level++;
		}
		logger.info("LEVEL " + level);

		Set<Integer> values = new HashSet<Integer>();
		double sumOfNumbers = checkNumbersForLevelAndOtherValues(level, 0, mapWithPowers, values,
				new ArrayList<Integer>());

		return sumOfNumbers;
	}

	private double checkNumbersForLevelAndOtherValues(int level, int prevSum,
			Map<Integer, Integer> mapWithPowers, Set<Integer> values, List<Integer> tabWithOldDigits) {

		if (level == 0) {
			return 0.0;
		}
		double returnValue = 0.0;
		int val;
		int newSum;
		List<Integer> tabWithDigits = new ArrayList<Integer>();
		for (int digit = 0; digit <= 9; digit++) {
			val = mapWithPowers.get(digit);
			newSum = prevSum + val;
			tabWithDigits.clear();
			tabWithDigits.addAll(tabWithOldDigits);
			tabWithDigits.add(digit);
			if (!values.contains(newSum) && isStringFromNumbers(newSum, tabWithDigits)) {
				values.add(newSum);
				returnValue += newSum;

			}
			returnValue += checkNumbersForLevelAndOtherValues(level - 1, newSum, mapWithPowers, values,
					tabWithDigits);
		}
		return returnValue;
	}

	private boolean isStringFromNumbers(int number, List<Integer> digits) {
		if ((digits == null) || (number == 1)) {
			return false;
		}
		String numString = String.valueOf(number);
		int length = digits.size();
		if (length != numString.length()) {
			return false;
		}

		List<Integer> temp = new ArrayList<Integer>(digits);
		for (int i = 0; i < length; i++) {
			int digit = Integer.parseInt(Character.toString(numString.charAt(i)));
			int index = temp.indexOf(digit);
			if (index == -1) {
				return false;
			}
			temp.remove(index);
		}
		return temp.isEmpty();
	}

	@Override
	public Double getCorrectProblemAnswer() {
		return 443839.0;
	}
}
