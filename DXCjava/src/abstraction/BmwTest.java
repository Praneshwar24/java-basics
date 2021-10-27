package abstraction;

import org.junit.Test;

import junit.framework.TestCase;

public class BmwTest extends TestCase{

	@Test
	public void testAdd() {
		System.out.println("I am in testAdd() method");

		int expected = 30;
		int actual = BmwFlyingCar.add(10,20);
		assertEquals(expected, actual);
	}

	@Test
	public void testEligibility() {
		System.out.println("I am in testEligibility() method");
		boolean actual = BmwFlyingCar.isEligibleToVote(18);

		assertTrue(actual);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("I am setting up the environment for test");
	}

	@Override
	protected void tearDown() throws Exception {

		super.tearDown();
		System.out.println("I am releasing the resources held for test");
	}}
