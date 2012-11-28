package pl.krajewski.euler.problems.implementations.problems041_050;

import java.util.ArrayList;
import java.util.List;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.numbers.NumberDigits;
import pl.krajewski.euler.problems.utils.numbers.primes.PrimeNumbers;

/**
 * @author mkrajewski
 */
public class Problem049 extends Problem<String> {

	@Override
	public String getCorrectProblemAnswer() {
		return "296962999629";
	}

	@Override
	public String resolveProblem() {
		List<Integer> primes = PrimeNumbers.getPrimesBelowNumberEratostothenesSieve(10000);
		List<Integer> primesAbove1000 = new ArrayList<Integer>();
		for (Integer prime : primes) {
			if (prime < 1000) {
				continue;
			}
			primesAbove1000.add(prime);
		}

		Integer numInSolution = getParameterForNumber(0);

		NumberDigits numberDigits = NumberDigits.getInstance();

		int iN, jN, kN;

		for (int i = 0; i < primesAbove1000.size(); i++) {

			iN = primesAbove1000.get(i);

			for (int j = i + 1; j < primesAbove1000.size(); j++) {

				jN = primesAbove1000.get(j);

				for (int k = j + 1; k < primesAbove1000.size(); k++) {

					kN = primesAbove1000.get(k);

					if (Math.abs(jN - iN) == Math.abs(kN - jN) && iN != numInSolution) {

						if (numberDigits.checkIfNumbersHasTheSameDigits(iN, jN)
								&& numberDigits.checkIfNumbersHasTheSameDigits(jN, kN)) {

							return iN + "" + jN + "" + kN;
						}
					}
				}
			}
		}
		return null;
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters(1487);
	}

}
