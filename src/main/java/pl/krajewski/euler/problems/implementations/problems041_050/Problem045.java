package pl.krajewski.euler.problems.implementations.problems041_050;

import java.util.HashMap;
import java.util.Map;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.SequenceNumbers;

public class Problem045 extends Problem<Long> {

	@Override
	public Long getCorrectProblemAnswer() {
		return 1533776805L;
	}

	@Override
	public Long resolveProblem() {
		Long tIndex = getParameterForNumber(0);
		Long pIndex = getParameterForNumber(1);
		Long hIndex = getParameterForNumber(2);
		Long value = getParameterForNumber(3);

		Map<Long, Long> tValues = new HashMap<Long, Long>();
		tIndex++;
		tValues.put(tIndex, SequenceNumbers.getInstance().getTriangleNumberForIndexAndPrevious(tIndex, value));
		tIndex++;
		Map<Long, Long> pValues = new HashMap<Long, Long>();
		pIndex++;
		pValues.put(pIndex, SequenceNumbers.getInstance().getPentagonalNumberForIndexAndPrevious(pIndex, value));
		pIndex++;
		Map<Long, Long> hValues = new HashMap<Long, Long>();
		hIndex++;
		hValues.put(hIndex, SequenceNumbers.getInstance().getHexagonalNumberForIndexAndPrevious(hIndex, value));
		hIndex++;

		for (;; hIndex++) {
			Long hVal = SequenceNumbers.getInstance().getHexagonalNumberForIndexAndPrevious(hIndex, hValues.get(hIndex - 1));
			hValues.put(hIndex, hVal);
			for (;; pIndex++) {
				Long pVal = SequenceNumbers.getInstance().getPentagonalNumberForIndexAndPrevious(pIndex, pValues.get(pIndex - 1));
				pValues.put(pIndex, pVal);
				if (pVal.equals(hVal)) {
					for (;; tIndex++) {
						Long tVal = SequenceNumbers.getInstance().getTriangleNumberForIndexAndPrevious(tIndex, tValues.get(tIndex - 1)); 
						tValues.put(tIndex, tVal);
						if(tVal.equals(pVal)) {
							logger.info("INDEXES, T:" + tIndex+",P:" + pIndex + ",H:"+hIndex);
							return tVal;
						} else if (tVal > pVal) {
							break;
						}
					}
				} else if (pVal > hVal) {
					break;
				}
			}
		}
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(285L, 165L, 143L, 40755L);
	}

}
