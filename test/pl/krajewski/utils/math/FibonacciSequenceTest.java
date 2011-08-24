package pl.krajewski.utils.math;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import pl.krajewski.euler.problems.utils.math.FibonacciSequence;

@Ignore
public class FibonacciSequenceTest {
	
	@Test
    public void checkIfDecimalNumberIsCorrectInBinary() {
        
        String expected = "0";
        assertEquals(expected, FibonacciSequence.findFibonacciStringForIndex(0));

        expected = "1";
        assertEquals(expected, FibonacciSequence.findFibonacciStringForIndex(1));
        
        expected = "1";
        assertEquals(expected, FibonacciSequence.findFibonacciStringForIndex(2));
        
        expected = "2";
        assertEquals(expected, FibonacciSequence.findFibonacciStringForIndex(3));
        expected = "3";
        assertEquals(expected, FibonacciSequence.findFibonacciStringForIndex(4));
        expected = "5";
        assertEquals(expected, FibonacciSequence.findFibonacciStringForIndex(5));
    }

}
