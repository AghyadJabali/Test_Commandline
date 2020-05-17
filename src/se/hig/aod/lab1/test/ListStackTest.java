package se.hig.aod.lab1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import se.hig.aod.lab1.Stack;
import se.hig.aod.lab1.StackEmptyException;
import se.hig.aod.lab1.ListStack;
/**
 * Tests for Stack implementation ListStack.
 * 
 * @author Anders Jjackson
 * @version 2019-11-15
 */
class ListStackTest {

	Stack<Character> testStack;
	char[] fixture = {'a', 'b', 'c', 'd'};

	@BeforeEach
	void setUp() throws Exception {
		testStack = new ListStack<>();
	}

	@AfterEach
	void tearDown() throws Exception {
		testStack = null;
	}

	@Test
	final void testNewStackIsEmpty() {
		assertTrue(testStack.isEmpty(), "A new instance cannot contain any item!");
	}

	@Test
	final void testStackWithItemNotEmpty() {
		testStack.push('a');
		assertFalse(testStack.isEmpty(), "Containing an item but say empty!");
	}

	@Test
	final void testPopOnEmptyStack() {
		assertThrows(StackEmptyException.class, 
						() -> testStack.pop(), 
						"Expected: StackEmptyException");
	}

	@Test
	final void testStackIsEmptyAfterPop() {
//		fail("Not yet implemented");	// TODO
		testStack.push('a');
		testStack.pop();
		assertTrue(testStack.isEmpty(), "A new instance cannot contain any item!");
		
	}

	@Test
	final void testPopOrder() {
//		fail("Not yet implemented");	// TODO
		
		testStack.push('a');
		testStack.push('b');
		testStack.push('c');
		testStack.push('d');
		
		assertEquals('d', testStack.pop());
		assertEquals('c', testStack.pop());
		
	}

	@Test
	final void testClearEmptyStack() {
//		fail("Not yet implemented");	// TODO
		testStack.isEmpty();
		testStack.clear();
		assertTrue(testStack.isEmpty(), "A new instance cannot contain any item!");
		
	}

	@Test
	final void testClearPopulatedStack() {
//		fail("Not yet implemented");	// TODO
		testStack.push('a');
		testStack.push('b');
		testStack.push('c');
		testStack.push('d');
		testStack.clear();
		assertTrue(testStack.isEmpty(), "A new instance cannot contain any item!");
	}
}