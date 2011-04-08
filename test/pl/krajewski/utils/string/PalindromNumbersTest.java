package pl.krajewski.utils.string;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.krajewski.euler.problems.utils.numbers.PalindromNumbers;

public class PalindromNumbersTest {

    @Test
    public void checkIfStringsArePalindromicCorrect() {
        String string = "10110000110001101";
        assertFalse(PalindromNumbers.isStringPalindrome(string));
    }
}
