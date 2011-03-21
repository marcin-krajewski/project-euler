package pl.krajewski.euler.problems.implementations.problems_11_20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.FileReader;

public class Problem11 extends Problem<Integer> {

	public Problem11(Parameters parameters) {
		super(parameters);
	}

	@Override
	public Integer resolveProblem() {
		String fileName = getParameterForNumber(0);
		int consecutiveNumbers = getParameterForNumber(1);
		
		int max = 0;
		
		String[] arr = FileReader.readProblemFileLines(fileName);
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			String line = arr[i];
			StringBuilder sb = new StringBuilder();
			for(int j=0; j<line.length(); j++) {
				char c = line.charAt(j);
				if(Character.isDigit(c)) {
					sb.append(Character.toString(c));
				}
				else if(!sb.toString().trim().isEmpty()){
					numbers.add(Integer.parseInt(sb.toString()));
					sb = new StringBuilder();
				}
			}
			if(!sb.toString().trim().isEmpty()){
				numbers.add(Integer.parseInt(sb.toString()));
				sb = new StringBuilder();
			}
		}
		
		int size = (int)Math.sqrt(numbers.size());
		
		int values[][] = new int[size][size];
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				values[i][j] = numbers.get(i*size+j);
			}
		}
		
		int[][] diffs = { 
				{0, 1}, {1, 0}, 
				{1, 1}
				, {1, -1} 
				};
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				for(int[] diff : diffs) {
					int res = values[i][j];
					boolean ok = true;
					for(int ii=1; ii<consecutiveNumbers; ii++) {
						try {
							Integer val = values[i+ii*diff[0]][j+ii*diff[1]];
							res *= val;
						}
						catch(ArrayIndexOutOfBoundsException ex) {
							ok = false;
							break;
						}
					}
					if(res > max && ok) {
						max = res;
					}
				}
			}
		}
		
		
		
		return max;
	}

}
