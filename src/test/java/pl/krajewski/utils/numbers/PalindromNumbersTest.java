package pl.krajewski.utils.numbers;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.krajewski.euler.problems.utils.numbers.PalindromNumbers;

public class PalindromNumbersTest {

    @Test
    public void checkIfStringsArePalindromicCorrect() {
        assertFalse(PalindromNumbers.isStringPalindrome("10110000110001101"));
        assertTrue(PalindromNumbers.isStringPalindrome("1"));
        assertTrue(PalindromNumbers.isStringPalindrome("2"));
        assertTrue(PalindromNumbers.isStringPalindrome("121"));
        assertTrue(PalindromNumbers.isStringPalindrome("111"));
        assertTrue(PalindromNumbers.isStringPalindrome("12345678987654321"));
        assertTrue(PalindromNumbers.isStringPalindrome("123456789987654321"));
        assertTrue(PalindromNumbers.isStringPalindrome("10110000100001101"));
    }
}
