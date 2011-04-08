package pl.krajewski.utils.math;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.krajewski.euler.problems.utils.math.BinaryNumber;

public class BinaryNumberTest {

    @Test
    public void checkIfDecimalNumberIsCorrectInBinary() {
        
        int number = 1;
        String expected = "1";
        assertEquals(expected, BinaryNumber.getBinaryStringForNumber(number));
        
        number = 16;
        expected = "10000";
        assertEquals(expected, BinaryNumber.getBinaryStringForNumber(number));
        
        number = 63;
        expected = "111111";
        assertEquals(expected, BinaryNumber.getBinaryStringForNumber(number));
    }
}
