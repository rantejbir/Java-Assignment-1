import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 */

/**
 @author Ramya Dandamudi
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
		MyHealthData health = new MyHealthData("Ramya","Dandamudi","female", 45,105,1990,2022);
		double expected = 36.5;
		Assert.assertEquals(expected, health.getBMI(), EPSILON);
		
	}

}