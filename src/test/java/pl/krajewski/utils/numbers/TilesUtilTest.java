package pl.krajewski.utils.numbers;

import junit.framework.Assert;

import org.junit.Test;

import pl.krajewski.euler.problems.utils.numbers.TilesUtil;

public class TilesUtilTest {

	@Test
	public void shouldCorrectWellTest() {
		Assert.assertEquals(0, TilesUtil.getInstance().getMoves(5, 6));
		Assert.assertEquals(1, TilesUtil.getInstance().getMoves(5, 5));
		Assert.assertEquals(7, TilesUtil.getInstance().getMoves(5, 2));
		Assert.assertEquals(2, TilesUtil.getInstance().getMoves(5, 4));
		Assert.assertEquals(3, TilesUtil.getInstance().getMoves(5, 3));
		Assert.assertEquals(5, TilesUtil.getInstance().getMoves(6, 3));
		Assert.assertEquals(12, TilesUtil.getInstance().getMoves(6, 2));
	}
}
