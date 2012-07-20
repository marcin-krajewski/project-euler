package pl.krajewski.euler.problems.utils.numbers.primes;

import java.util.ArrayList;
import java.util.List;

public class EratosthenesSieve implements IPrimeNumbersInRange {

	public List<Integer> getPrimesBelowNumber(Integer number) {

		List<Integer> none = new ArrayList<Integer>();

		Integer sqrt = (int) Math.sqrt(number);

		Integer checkNum = 1;
		while (checkNum++ < sqrt) {
			if (none.contains(checkNum)) {
				continue;
			}
			for (int numToRevert = checkNum * 2; numToRevert <= number; numToRevert += checkNum) {
				if (none.contains(numToRevert)) {
					continue;
				}
				none.add(numToRevert);
			}
		}

		List<Integer> list = new ArrayList<Integer>();
		for (int prime = 2; prime <= number; prime++) {
			if (!none.contains(prime)) {
				list.add(prime);
			}
		}

		return list;
	}
}
