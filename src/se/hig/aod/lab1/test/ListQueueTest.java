/**
 * 
 */
package se.hig.aod.lab1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import se.hig.aod.lab1.ListQueue;

/**
 * JUnit test of ListQueue
 * 
 * @author Anders Jackson
 * @version 2019-11-14
 */
class ListQueueTest {

	private int[] initValues = {1, 2, 3, 4};
	
	private ListQueue<String> stringQueue;
	private ListQueue<Integer> intQueue;
	private ListQueue<Integer> initIntQueue;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.err.println("setUpBeforeClass()");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.err.println("tearDownAfterClass()");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.err.println("setUp()");
		stringQueue = new ListQueue<>();
		intQueue = new ListQueue<>();
		initIntQueue = new ListQueue<>();
		for (int i : initValues) {
			initIntQueue.enqueue(i);
		}
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.err.println("tearDown()");
	}

	/**
	 * Test method for {@link se.hig.aod.lab1.ListQueue#ListQueue()}.
	 */
	@Test
	final void testListQueue() {
		assertNotNull(intQueue, "intQueue not initialized");
		assertNotNull(stringQueue, "stringQueue not initialized");
		assertNotNull(initIntQueue, "initIntQueue not initialized");
	}

	/**
	 * Test method for {@link se.hig.aod.lab1.ListQueue#clear()}.
	 */
	@Test
	final void testClear() {
//		fail("To be done.");	// TODO
		intQueue.clear();
		assertTrue(intQueue.isEmpty(), "should return true on intQueue");
		
	}

	/**
	 * Test method for {@link se.hig.aod.lab1.ListQueue#isEmpty()}.
	 */
	@Test
	final void testIsEmpty() {
		assertTrue(intQueue.isEmpty(), "should return true on intQueue");
		assertTrue(stringQueue.isEmpty(), "should return true on stringQueue");
		assertFalse(initIntQueue.isEmpty(), "should return fals on initIntQueue");
	}

	/**
	 * Test method for {@link se.hig.aod.lab1.ListQueue#isFull()}.
	 */
	@Test
	final void testIsFull() {
//		fail("To be done.");	// TODO
		assertFalse(initIntQueue.isEmpty(), "should return fals on initIntQueue");
	}

	/**
	 * Test method for {@link se.hig.aod.lab1.ListQueue#enqueue(java.lang.Object)}.
	 */
	@Test
	final void testEnqueue() {
		assertTrue(intQueue.isEmpty());
		intQueue.enqueue(1);
		assertFalse(intQueue.isEmpty());
		final Integer data = intQueue.dequeue();
		assertNotNull(data, "should not return null from a non empty intQueue");
		assertEquals(data.intValue(), 1, "should return 1 from intQueue");
	}

	/**
	 * Test method for {@link se.hig.aod.lab1.ListQueue#dequeue()}.
	 */
	@Test
	final void testDequeue() {
//		fail("To be done.");	// TODO
		initIntQueue.dequeue();
		int temp= initIntQueue.getFront();
		assertEquals(2, temp);
	}

	/**
	 * Test method for {@link se.hig.aod.lab1.ListQueue#getFront()}.
	 */
	@Test
	final void testGetFront() {
//		fail("To be done.");	// TODO
		int front = initIntQueue.getFront();
		assertEquals(1, front);
	}

}
