package pl.krajewski.euler.problems.implementations.problems011_020;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.classes.MapDoubleKey;
import pl.krajewski.euler.problems.utils.string.FileReader;

public class Problem011 extends Problem<Integer> {

    @Override
    protected Parameters getParametersForProblem() {
        return new Parameters("problem11.txt", 4);
    }
    
	@Override
	public Integer resolveProblem() {
		String fileName = getParameterForNumber(0);
		int consecutiveNumbers = getParameterForNumber(1);

		MapDoubleKey<Integer, Integer, Integer> numbers = FileReader
				.getLinesWithNumbersSeparatedWithSpaceForFileName(fileName);

		Date d1 = new Date();
		int[][] diffs = { { 0, 1 }, { 1, 0 }, { 1, 1 }, { 1, -1 } };

		int max = 0;
		int res;
		boolean hasProducts;

		for (int i : numbers.k1Values()) {
			for (int j : numbers.k2ValuesForK1(i)) {
				for (int[] diff : diffs) {
					res = numbers.get(i, j);
					hasProducts = true;
					for (int ii = 1; ii < consecutiveNumbers; ii++) {
						Integer val = numbers.get(i + ii * diff[0], j + ii
								* diff[1]);
						if (val != null) {
							res *= val;
						}
						else {
							hasProducts = false;
							break;
						}
					}
					if (res > max && hasProducts) {
						max = res;
					}
				}
			}
		}
		Date d2 = new Date();
		System.out.println(d2.getTime() - d1.getTime()+" --- TIME");
		return max;
	}

    @Override
    public Integer getCorrectProblemAnswer() {
        return 70600674;
    }
}
