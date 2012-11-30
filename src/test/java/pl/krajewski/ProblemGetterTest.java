package pl.krajewski;

import org.junit.Assert;
import org.junit.Test;

import pl.krajewski.euler.ProblemGetter;

/**
 * @author mkrajewski
 */
public class ProblemGetterTest {

	@Test
	public void shouldGetPackageNameWorksCorrectTest() {
		ProblemGetter instance = ProblemGetter.getInstance();
		Assert.assertEquals(ProblemGetter.PACKAGE_PREFIX + "201_210", instance.getPackageNameForProblemNumber(202));
		Assert.assertEquals(ProblemGetter.PACKAGE_PREFIX + "021_030", instance.getPackageNameForProblemNumber(25));
		Assert.assertEquals(ProblemGetter.PACKAGE_PREFIX + "031_040", instance.getPackageNameForProblemNumber(40));
		Assert.assertEquals(ProblemGetter.PACKAGE_PREFIX + "041_050", instance.getPackageNameForProblemNumber(41));
		Assert.assertEquals(ProblemGetter.PACKAGE_PREFIX + "001_010", instance.getPackageNameForProblemNumber(7));
		Assert.assertEquals(ProblemGetter.PACKAGE_PREFIX + "101_110", instance.getPackageNameForProblemNumber(101));
		Assert.assertEquals(ProblemGetter.PACKAGE_PREFIX + "101_110", instance.getPackageNameForProblemNumber(110));
		Assert.assertEquals(ProblemGetter.PACKAGE_PREFIX + "091_100", instance.getPackageNameForProblemNumber(91));
		Assert.assertEquals(ProblemGetter.PACKAGE_PREFIX + "091_100", instance.getPackageNameForProblemNumber(100));
	}

}
