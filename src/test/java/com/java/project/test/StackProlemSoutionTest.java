package com.java.project.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.java.project.MyStack;

public class StackProlemSoutionTest {
	
	@Test 
	public void size() {
        MyStack myStack = new MyStack(3); 
		assertTrue(myStack.size() == 0); myStack.push(1); 
		assertEquals(1, myStack.size()); 
		}
	
	@Test 
	public void isEmpty() { 
		MyStack myStack  =  new MyStack(3);
		assertTrue(myStack.isEmpty()); myStack.push(2);
		assertFalse(myStack.isEmpty()); myStack.pop(); 
		assertTrue(myStack.isEmpty());
		}
	
	
	@Test 
	public void pushAndPop() {
		MyStack myStack = new MyStack(3);
		assertEquals(0, myStack.size()); myStack.push(46);
		assertEquals(1, myStack.size()); myStack.push(53);
		assertEquals(2, myStack.size()); assertEquals(53, myStack.pop());
		assertEquals(46, myStack.pop()); assertEquals(0, myStack.size()); 
		} 

}
