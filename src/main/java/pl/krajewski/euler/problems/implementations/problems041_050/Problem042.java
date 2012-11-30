package pl.krajewski.euler.problems.implementations.problems041_050;

import java.util.List;
import java.util.Set;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.SequenceNumbers;
import pl.krajewski.euler.problems.utils.string.EnglishAlphabet;
import pl.krajewski.euler.problems.utils.string.FileReader;

public class Problem042 extends Problem<Long> {

	@Override
	public Long getCorrectProblemAnswer() {
		return null;
	}

	@Override
	public Long resolveProblem() {
		String fileName = getParameterForNumber(0);
		String fileContent = FileReader.readProblemFileInOneLine(fileName).trim();
		Set<String> words = FileReader.getWordsSeparatedWithCommasWithoutQuotations(fileContent);
		int maxLen = 0;
		for (String word : words) {
			if (maxLen < word.length()) {
				maxLen = word.length();
			}
		}

		long maxTriangle = EnglishAlphabet.letters.get('Z') * maxLen;
		List<Long> triangleNumbers = SequenceNumbers.getInstance().getTriangleNumberBelowMax(maxTriangle);
		Long triangleWordsCount = 0L;
		for (String word : words) {
			if (triangleNumbers.contains(EnglishAlphabet.getStringLongValue(word))) {
				triangleWordsCount++;
			}
		}
		return triangleWordsCount;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters("problem042.txt");
	}

}
