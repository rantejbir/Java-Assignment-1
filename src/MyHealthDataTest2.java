import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 */

/**
 @author Rantejbir Singh
 * @see MyHealthDataTest2
 *
 */
public class MyHealthDataTest2 {
	
	private static final double EPSILON = 0.01;

	/**
	 * Test method for {@link MyHealthData#getBMI()}.
	 * Testing if the getBMI will match the expected
	 */
	@Test
	public void testGetBMI() {
		MyHealthData health = new MyHealthData("rantejbir","Singh","male", 45,105,2002,2022);
		double expected = 36.45;
		Assert.assertEquals(expected, health.getBMI(), EPSILON);
		
	}

}