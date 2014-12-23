package com.run.leetcode;

import junit.framework.TestCase;

public class RemoveDuplicatesfromSortedArrayTest extends TestCase {

	protected static void setUpBeforeClass() throws Exception {
	}

	protected static void tearDownAfterClass() throws Exception {
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testRemoveDuplicates() {
		int[] A = { 1, 1, 2 };

		assertEquals(2,
				new RemoveDuplicatesfromSortedArray().removeDuplicates(A));
	}
}
