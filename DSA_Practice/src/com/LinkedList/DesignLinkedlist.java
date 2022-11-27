package com.LinkedList;

import java.util.ArrayList;

/*Given a matrix A of size Nx3 representing operations. Your task is to design the linked list based on these operations.

There are four types of operations:

0 x -1: Add a node of value x before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
1 x -1: Append a node of value x to the last element of the linked list.
2 x index: Add a node of value x before the indexth node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
3 index -1: Delete the indexth node in the linked list, if the index is valid.
A[i][0] represents the type of operation.

A[i][1], A[i][2] represents the corresponding elements with respect to type of operation.

Note: Indexing is 0 based.


Problem Constraints
1 <= Number of operations <= 1000
1 <= All node values <= 109


Input Format
The only argument given is matrix A.


Output Format
Return the pointer to the starting of the linked list.


Example Input
Input 1:
    A = [   [0, 1, -1]
            [1, 2, -1]
            [2, 3, 1]   ]
Input 2:
    A = [   [0, 1, -1]
            [1, 2, -1]
            [2, 3, 1]
            [0, 4, -1]
            [3, 1, -1]
            [3, 2, -1]  ]


Example Output
Output 1:
    1->3->2->NULL
 
Output 2:
    4->3->NULL*/

public class DesignLinkedlist {
	


	 class ListNode {
	      public int val;
	     public ListNode next ;
	     ListNode(int x) { val = x; next = null; }
	  }
	 
	public class Solution {
	    ListNode head=null;
	    int count=0;
	    public ListNode solve(ArrayList<ArrayList<Integer>> A) {
	        for(int i=0;i<A.size();i++){
	            //switch is used for the opertion that divided into 4 part 
	             switch(A.get(i).get(0)){
	                 //insert value at first node as head.
	                 case 0: insert(A.get(i).get(1),0);
	                    break;
	                    //insert the value at the end of the linkedlist
	                 case 1: insert(A.get(i).get(1),count);
	                    break;
	                    // insert the vaue at user selected 
	                 case 2: insert(A.get(i).get(1),A.get(i).get(2));
	                    break;
	                    // if value is 3 delete the current node.
	                 case 3: delete(A.get(i).get(1));
	             }

	        }

	        return head;

	       }

	    public void insert(int val,int pos){
	        if(pos>count){
	            return;
	        }

	        ListNode node= new ListNode(val);

	        if(pos==0){
	            node.next=head;
	            head=node;
	        }else{
	            ListNode temp=head;
	            int c=0;
	            while(c<pos-1){
	                temp=temp.next;
	                c++;
	            }
	         node.next=temp.next;
	         temp.next=node;
	        }

	     count++;
	        
	    }

	    public void delete(int pos){
	        if(pos>=count){
	            return;
	        }

	        if(pos==0){
	            head=head.next;
	        }else{
	            ListNode temp=head;
	            int c=0;

	            while(c<pos-1){
	                temp=temp.next;
	                c++;
	            }

	            temp.next=temp.next.next;

	        }
	        count--;
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
