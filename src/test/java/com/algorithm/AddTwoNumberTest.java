package com.algorithm;

import org.junit.Test;

public class AddTwoNumberTest {

	@Test
	public void testAddTwoNumbers(){
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		AddTwoNumbers unit = new AddTwoNumbers();
		ListNode result = unit.addTwoNumbers(l1, l2);
		System.out.println(result.toString());
	}
}
