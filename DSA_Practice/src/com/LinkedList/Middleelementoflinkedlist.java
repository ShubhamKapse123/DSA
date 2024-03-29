package com.LinkedList;

/*Problem Description
Given a linked list of integers, find and return the middle element of the linked list.

NOTE: If there are N nodes in the linked list and N is even then return the (N/2 + 1)th element.



Problem Constraints
1 <= length of the linked list <= 100000

1 <= Node value <= 109



Input Format
The only argument given head pointer of linked list.



Output Format
Return the middle element of the linked list.



Example Input
Input 1:

 1 -> 2 -> 3 -> 4 -> 5
Input 2:

 1 -> 5 -> 6 -> 2 -> 3 -> 4


Example Output
Output 1:

 3
Output 2:

 2


Example Explanation
Explanation 1:

 The middle element is 3.
Explanation 2:

 The middle element in even length linked list of length N is ((N/2) + 1)th element which is 2.



See Expected Output

One way is to traverse the whole linked list and calculate the length and then traverse half the length to find the middle element.

We can do it in one traversal by maintaining a slow and fast pointer.

The fast pointer moves twice as the slow pointer does. When the fast pointer is at the end of the linked list, the slow pointer will point to the middle element.

Return the element at which the slow pointer points.*/

public class Middleelementoflinkedlist {
	
	
	
	  class ListNode {
	      public int val;
	      public ListNode next;
	      ListNode(int x) { val = x; next = null; }
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int solve(ListNode A) {
	        ListNode slow=A;
	        ListNode fast=A;

	        while(fast.next!=null && fast.next.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	        }


	        if(fast.next==null){
	            return slow.val;
	        }
	    
	        //we take this edge case for handle  N is even then return the (N/2 + 1)th element.
	    
	        return slow.next.val;
	    }

}
