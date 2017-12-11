/**
 * 
 */
package pl.com.simbit.euler.problems.implementations.problems061_070;

import pl.com.simbit.euler.problems.Parameters;
import pl.com.simbit.euler.problems.Problem;
import pl.com.simbit.utility.problems.string.StringPower;

/**
 * @author mkrajewski
 * 
 */
public class Problem063 extends Problem<Byte> {

	@Override
	public Byte getCorrectProblemAnswer() {
		return 49;
	}

	@Override
	public Byte resolveProblem() {
		byte count = 0;

		int power = 1;
		while (true) {
			boolean breakOut = true;
			for (int i = 1;; i++) {
				int length = StringPower.getPowerForNumberBelow10(i, power).length();
				if (length == power) {
					breakOut = false;
					count++;
				} else if (length > power) {
					break;
				}
			}
			if (breakOut) {
				break;
			}
			power++;
		}
		return count;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return null;
	}

}
