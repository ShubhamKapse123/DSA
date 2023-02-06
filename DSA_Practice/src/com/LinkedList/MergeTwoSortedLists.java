package com.LinkedList;

/*Merge two sorted linked lists, A and B, and return it as a new list.

The new list should be made by splicing together the nodes of the first two lists and should also be sorted.



Problem Constraints
0 <= |A|, |B| <= 105



Input Format
The first argument of input contains a pointer to the head of linked list A.

The second argument of input contains a pointer to the head of linked list B.



Output Format
Return a pointer to the head of the merged linked list.



Example Input
Input 1:

 A = 5 -> 8 -> 20
 B = 4 -> 11 -> 15
Input 2:

 A = 1 -> 2 -> 3
 B = Null


Example Output
Output 1:

 4 -> 5 -> 8 -> 11 -> 15 -> 20
Output 2:

 1 -> 2 -> 3


Example Explanation
Explanation 1:

 Merging A and B will result in 4 -> 5 -> 8 -> 11 -> 15 -> 20 
Explanation 2:

 We don't need to merge as B is empty. 
 
 The first thing to note is that all you would want to do is modify the next pointers. You don’t need to create new nodes.

At every step, you choose the minimum of the current head X on the 2 lists and modify your answer’s next pointer to X. You move the current pointer on the said list and the current answer.

Corner case,
Make sure that at the end of the loop, when one of the lists goes empty, you do include the remaining elements from the second list into your answer.

Test case : 1->2->3 4->5->6
*/

public class MergeTwoSortedLists {
	
	 
	  class ListNode {
	      public int val;
	      public ListNode next;
	     ListNode(int x) { val = x; next = null; }
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode ll1=A;
        ListNode ll2=B;
        //dummy node take for handle the some edge cases that cause to be null pointer
        ListNode dummyNode=new ListNode(-1);
        ListNode head=dummyNode;
        ListNode tail=dummyNode;

  //traversing the both list using ll1 and ll2
        while(ll1!=null && ll2!=null){
            if(ll1.val<=ll2.val){
                tail.next=ll1;
                ll1=ll1.next;
                tail=tail.next;
            }else{
                tail.next=ll2;
                ll2=ll2.next;
                tail=tail.next;
            }
        // this will add remaining node if ll1 is null
            if(ll1==null){
                tail.next=ll2;
            }
    // this will add remaining node if ll2 is null
            if(ll2==null){
                tail.next=ll1;
            }
        }
// return head.next because we take dummy node first
        return head.next;
    }
}


