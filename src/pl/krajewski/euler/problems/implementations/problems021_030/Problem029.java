package pl.krajewski.euler.problems.implementations.problems021_030;

import java.util.HashSet;
import java.util.Set;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.string.StringPower;

public class Problem029 extends Problem<Integer> {

	private Integer minAIndex = 0;
	private Integer maxAIndex = 1;
	private Integer minBIndex = 2;
	private Integer maxBIndex = 3;

	@Override
	public Integer resolveProblem() {
		int minA = getParameterForNumber(minAIndex);
		int maxA = getParameterForNumber(maxAIndex);
		int minB = getParameterForNumber(minBIndex);
		int maxB = getParameterForNumber(maxBIndex);
		
		Set<String> powers = new HashSet<String>();
		for(int a=minA; a<=maxA; a++) {
			for(int b=minB; b<=maxB; b++) {
				String power = StringPower.getPowerForNumberBelow10(a, b);
				powers.add(power);
			}
		}
		return powers.size();
	}

}
