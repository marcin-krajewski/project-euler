package pl.krajewski.utils.numbers;

import static org.junit.Assert.*;
import org.junit.Test;
import pl.krajewski.euler.problems.utils.numbers.Triangle;

public class TriangleTest {

	@Test
	public void checkNumberOfRightTringlesForPerimeter() {

		assertEquals(3, Triangle.getNumberOfRightANgleTrianglesForPerimeter(120));
	}
}
