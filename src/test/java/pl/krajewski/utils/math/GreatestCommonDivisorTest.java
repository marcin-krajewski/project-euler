package pl.krajewski.utils.math;

import static org.junit.Assert.*;
import org.junit.Test;
import pl.krajewski.euler.problems.utils.math.GreatestCommonDivisor;

public class GreatestCommonDivisorTest {

	@Test
	public void checkIfGreatestCommonDivisorWorksCorrectly() {
		
		double greatestCommonDivisor = GreatestCommonDivisor.getGreatestCommonDivisor(48, 180);
		assertEquals(12.0, greatestCommonDivisor, 0.001);
	}
}