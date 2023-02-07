package com.LinkedList;

public class SortList {
	/*
	 * Sort a linked list, A in O(n log n) time using constant space complexity.
	 * 
	 * 
	 * 
	 * Problem Constraints 0 <= |A| = 105
	 * 
	 * 
	 * 
	 * Input Format The first and the only arugment of input contains a pointer to
	 * the head of the linked list, A.
	 * 
	 * 
	 * 
	 * Output Format Return a pointer to the head of the sorted linked list.
	 * 
	 * 
	 * 
	 * Example Input Input 1:
	 * 
	 * A = [3, 4, 2, 8] Input 2:
	 * 
	 * A = [1]
	 * 
	 * 
	 * Example Output Output 1:
	 * 
	 * [2, 3, 4, 8] Output 2:
	 * 
	 * [1]
	 * 
	 * 
	 * Example Explanation Explanation 1:
	 * 
	 * The sorted form of [3, 4, 2, 8] is [2, 3, 4, 8]. Explanation 2:
	 * 
	 * The sorted form of [1] is [1].
	 * 
	 * 
	 * We can try to implement either merge sort or qsort.
	 * 
	 * Let us look at the merge sort. We start traversing the singly linked list to
	 * find the midpoint of the singly linked list. Now, we will sort the first half
	 * and second half separately by calling the merge sort function on them. Then
	 * we only have to merge the 2 lists ( Note that we already have solved a
	 * problem to merge 2 lists ).
	 */
	  class ListNode {
	      public int val;
	      public ListNode next;
	      ListNode(int x) { val = x; next = null; }
	  }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public ListNode sortList(ListNode A) {
	        if(A==null || A.next==null) return A;
	        // find the middle point 
	        ListNode mid=midPoint(A);
	        ListNode h2= mid.next;
	        mid.next=null;
	        //sorted the two separt list
	        A=sortList(A);
	        h2=sortList(h2);

	   //marge both list and return sorted
	       return mergeTwoLists(A,h2);
	    }

	  public static ListNode midPoint(ListNode l){

	      ListNode s=l;
	      ListNode f=l;

	      while(f.next!=null&&f.next.next!=null){
	          s=s.next;
	          f=f.next.next;
	      }
	      return s;

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
