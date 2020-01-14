package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	private final int EMPTY_STACK_VALUE = -1;
	private final int TEST_VALUE = 4;

	@Test
	public void testReportRejectedHanoiRhymer() {
		HanoiRhymer rhymer = new HanoiRhymer();

		Assert.assertEquals(0, rhymer.reportRejected());

		rhymer.countIn(TEST_VALUE);
		rhymer.countIn(TEST_VALUE + 1);

		Assert.assertEquals(1, rhymer.reportRejected());
	}

	@Test
	public void testCountInHanoiRhymer() {
		HanoiRhymer rhymer = new HanoiRhymer();

		rhymer.countIn(TEST_VALUE);
		Assert.assertEquals(TEST_VALUE, rhymer.peekaboo());
	}

	@Test
	public void testCountOutFIFORhymer() {
		FIFORhymer rhymer = new FIFORhymer();

		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());

		rhymer.countIn(TEST_VALUE);

		Assert.assertEquals(TEST_VALUE, rhymer.countOut());
		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());
	}

	@Test
	public void testGetTotalDefaultCountingOutRhymer() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.getTotal());
		rhymer.countIn(TEST_VALUE);
		Assert.assertEquals(0, rhymer.getTotal());
	}

	@Test
	public void testCountInDefaultCountingOutRhymer() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

		rhymer.countIn(TEST_VALUE);
		Assert.assertEquals(TEST_VALUE, rhymer.peekaboo());
	}

	@Test
	public void testCallCheckDefaultCountingOutRhymer() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

		Assert.assertTrue(rhymer.callCheck());
		rhymer.countIn(TEST_VALUE);
		Assert.assertFalse(rhymer.callCheck());
	}

	@Test
	public void testIsFullDefaultCountingOutRhymer() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			Assert.assertFalse(rhymer.isFull());
			rhymer.countIn(TEST_VALUE);
		}

		Assert.assertFalse(rhymer.isFull());
	}

	@Test
	public void testPeekabooDefaultCountingOutRhymer() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.peekaboo());

		rhymer.countIn(TEST_VALUE);

		Assert.assertEquals(TEST_VALUE, rhymer.peekaboo());
		Assert.assertEquals(TEST_VALUE, rhymer.peekaboo());
	}

	@Test
	public void testCountOutDefaultCountingOutRhymer() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());

		rhymer.countIn(TEST_VALUE);

		Assert.assertEquals(TEST_VALUE, rhymer.countOut());
		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());
	}

}
