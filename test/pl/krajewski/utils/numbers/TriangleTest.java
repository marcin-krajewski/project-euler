package pl.krajewski.utils.numbers;

import static org.junit.Assert.*;
import org.junit.Test;
import pl.krajewski.euler.problems.utils.numbers.Triangle;

public class TriangleTest {

	@Test
	public void checkNumberOfRightTringlesForPerimeter() {

		int numberOfTriangles = Triangle
				.getNumberOfRightANgleTrianglesForPerimeter(120);
		assertEquals(3, numberOfTriangles);
	}
}
