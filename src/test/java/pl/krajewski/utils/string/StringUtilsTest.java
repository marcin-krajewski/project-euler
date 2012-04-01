package pl.krajewski.utils.string;

import static org.junit.Assert.*;
import org.junit.Test;
import pl.krajewski.euler.problems.utils.string.StringAsNum;

public class StringUtilsTest {

	@Test
	public void checkIfProductOk() {
		String num1 = "115";
		String num2 = "24";
		String product1 = StringAsNum.productTwoNumbers(num1, num2);
		String product2 = StringAsNum.productTwoNumbers(num2, num1);
		assertEquals("2760", product1);
		assertEquals("2760", product2);
		assertEquals(product1, product2);
	}
}
