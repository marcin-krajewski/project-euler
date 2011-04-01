package pl.krajewski.utils.string;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import pl.krajewski.euler.problems.utils.string.Factorial;

public class FactorialTest {

    private String factorial;
    private Map<Integer, String> factorialValues = new HashMap<Integer, String>(); 
    
    @Before
    public void init() {
        factorialValues.put(1, "1");
        factorialValues.put(2, "2");
        factorialValues.put(3, "6");
        factorialValues.put(4, "24");
        factorialValues.put(5, "120");
        factorialValues.put(6, "720");
        factorialValues.put(7, "5040");
        factorialValues.put(8, "40320");
        factorialValues.put(9, "362880");
        factorialValues.put(10, "3628800");
    }
    
    @Test
    public void checkFactorialCannotBeNull() {
        factorial = Factorial.factorial(0);
        assertNotNull(factorial);
        factorial = Factorial.factorial(-1);
        assertNotNull(factorial);
        factorial = Factorial.factorial(100);
        assertNotNull(factorial);
    }
    
    @Test
    public void checkIfFactorialOf0Is1() {
        factorial = Factorial.factorial(0);
        assertEquals("1", factorial);
    }
    
    @Test
    public void checkIfFactorialBelow0Is0() {
        factorial = Factorial.factorial(-1);
        assertEquals("0", factorial);
    }
    
    @Test
    public void checkFirst10FactorialValues() {
        System.out.println("CHECKING FACTORIALS");
        for(Integer number : factorialValues.keySet()) {
            System.out.println("CHECKING FACTORIAL: "+number);
            factorial = Factorial.factorial(number);
            assertEquals(factorialValues.get(number), factorial);
        }
        System.out.println("\tTEST SUCCESS");
    }
}
