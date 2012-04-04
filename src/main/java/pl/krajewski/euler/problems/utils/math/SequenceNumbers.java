package pl.krajewski.euler.problems.utils.math;

import java.util.ArrayList;
import java.util.List;

public class SequenceNumbers {

	private static SequenceNumbers instance;

	private SequenceNumbers() {
	}

	public static synchronized SequenceNumbers getInstance() {
		if (instance == null) {
			instance = new SequenceNumbers();
		}
		return instance;
	}
	
	public List<Long> getTriangleNumberBelowMax(Long max) {
		List<Long> triangleNumbers = new ArrayList<Long>();
		Long num = getTriangleNumberForIndex(1L);
		triangleNumbers.add(num);
		for(long index = 2L; ; index++) {
			num = getTriangleNumberForIndexAndPrevious(index, num);
			if(num > max) {
				break;
			}
			triangleNumbers.add(num);
		}
		return triangleNumbers;
	}

	public List<Long> getTriangleNumberToIndex(Long maxIndex) {
		List<Long> triangleNumbers = new ArrayList<Long>();
		Long num = getTriangleNumberForIndex(1L);
		triangleNumbers.add(num);
		for(long index = 2L; index <= maxIndex; index++) {
			num = getTriangleNumberForIndexAndPrevious(index, num);
			triangleNumbers.add(num);
		}
		return triangleNumbers;
	}
	
	private Long getTriangleNumberForIndex(Long index) {
		return index * (index + 1) / 2;
	}

	private Long getTriangleNumberForIndexAndPrevious(Long index, Long previous) {
		return previous + index;
	}
}
