package pl.krajewski.utils.string;

import static org.junit.Assert.*;
import org.junit.Test;
import pl.krajewski.euler.problems.utils.numbers.ConcatenatedProductOfNumbers;

public class ConcatenatedProductOfNumbersTest {

	@Test
	public void checkIfNumberHasDifferentDigits() {

		assertTrue(ConcatenatedProductOfNumbers
				.checkIfNumberHasDifferentDigits(12345));
		assertTrue(ConcatenatedProductOfNumbers
				.checkIfNumberHasDifferentDigits(0));
		assertTrue(ConcatenatedProductOfNumbers
				.checkIfNumberHasDifferentDigits(1));
		assertTrue(ConcatenatedProductOfNumbers
				.checkIfNumberHasDifferentDigits(1234567890));
		assertTrue(ConcatenatedProductOfNumbers
				.checkIfNumberHasDifferentDigits(12));
		assertFalse(ConcatenatedProductOfNumbers
				.checkIfNumberHasDifferentDigits(11));
		assertFalse(ConcatenatedProductOfNumbers
				.checkIfNumberHasDifferentDigits(1111111));
		assertFalse(ConcatenatedProductOfNumbers
				.checkIfNumberHasDifferentDigits(1234567891));

	}

	@Test
	public void checkIfNumberHasDifferentAndNotContains0Digits() {

		assertTrue(ConcatenatedProductOfNumbers
				.checkIfNumberHasDifferentDigitsAndNotContains0(12345));
		assertFalse(ConcatenatedProductOfNumbers
				.checkIfNumberHasDifferentDigitsAndNotContains0(0));
		assertTrue(ConcatenatedProductOfNumbers
				.checkIfNumberHasDifferentDigitsAndNotContains0(1));
		assertFalse(ConcatenatedProductOfNumbers
				.checkIfNumberHasDifferentDigitsAndNotContains0(1234567890));
		assertTrue(ConcatenatedProductOfNumbers
				.checkIfNumberHasDifferentDigitsAndNotContains0(12));
		assertFalse(ConcatenatedProductOfNumbers
				.checkIfNumberHasDifferentDigitsAndNotContains0(11));
		assertFalse(ConcatenatedProductOfNumbers
				.checkIfNumberHasDifferentDigitsAndNotContains0(1111111));
		assertFalse(ConcatenatedProductOfNumbers
				.checkIfNumberHasDifferentDigitsAndNotContains0(1234567891));
	}
}
