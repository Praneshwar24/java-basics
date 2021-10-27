package abstraction;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.TestCase;

public class IgnoreTest extends TestCase{
	
	@Ignore
	@Test
	public void setAdd() {
		System.out.println("I am in testAdd() method");

		int expected = 30;
		int actual = BmwFlyingCar.add(10,20);
		assertEquals(expected,actual);
	}

	@Test
	public void testEligibility() {
		System.out.println("I am in testEligibility() method");

		boolean actual = BmwFlyingCar.isEligibleToVote(18);

		assertTrue(actual);
	}}
