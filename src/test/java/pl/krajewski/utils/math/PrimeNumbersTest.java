package pl.krajewski.utils.math;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.krajewski.euler.problems.utils.math.PrimeNumbers;

public class PrimeNumbersTest {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	public void largePrimeNumberTest() {
		Date d1 = new Date();
		boolean numberPrime = PrimeNumbers.isNumberPrime(new Double(688846502588399.0));
		Date d2 = new Date();
		logger.info("TIME "+(d2.getTime()-d1.getTime()));
		Assert.assertTrue(numberPrime);
	}
}
