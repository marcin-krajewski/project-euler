package pl.krajewski.euler.problems.implementations.problems051_060;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.poker.Poker;
import pl.krajewski.euler.problems.poker.PokerHand;
import pl.krajewski.euler.problems.utils.string.FileReader;

public class Problem054 extends Problem<Integer> {

	@Override
	public Integer getCorrectProblemAnswer() {
		return 376;
	}

	@Override
	public Integer resolveProblem() {
		String fileName = getParameterForNumber(0);
		String[] lines = FileReader.readProblemFileLines(fileName);
		int p1won = 0;
		for (String line : lines) {
			String[] cards = line.split(" ");
			PokerHand ph1 = new PokerHand(new Poker(cards[0], cards[1],
					cards[2], cards[3], cards[4]));
			PokerHand ph2 = new PokerHand(new Poker(cards[5], cards[6],
					cards[7], cards[8], cards[9]));

			if (ph1.compareTo(ph2) > 0) {
				p1won++;
			}
		}
		return p1won;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters("problem054.txt");
	}

}
