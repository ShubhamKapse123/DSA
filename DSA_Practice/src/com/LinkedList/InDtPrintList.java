package com.LinkedList;
/*Design and implement a Linked List data structure.
A node in a linked list should have the following attributes - an integer value and a pointer to the next node. It should support the following operations:

insert_node(position, value) - To insert the input value at the given position in the linked list.
delete_node(position) - Delete the value at the given position from the linked list.
print_ll() - Print the entire linked list, such that each element is followed by a single space.
Note:

If an input position does not satisfy the constraint, no action is required.
Each print query has to be executed in a new line.


Problem Constraints
1 <= value <= 105
1 <= position <= n where, n is the size of the linked-list.



Input Format
First line contains an integer denoting number of cases, let's say t.
Next t line denotes the cases.


Output Format
When there is a case of print_ll(),  Print the entire linked list, such that each element is followed by a single space.
NOTE: You don't need to return anything.


Example Input
5
i 1 23
i 2 24
p
d 1
p


Example Output
23 24
24


Example Explanation
After first two cases linked list contains two elements 23 and 24.
At third case print: 23 24.
At fourth case delete value at first position, only one element left 24.
At fifth case print: 24.*/

//TC:O(P) and SC:O(1)

public class InDtPrintList {
	
	//create the node class for storing data for every node
	 static class Node{
	       int data;
	       Node next;
	       public Node(){
	           this.data=0;
	           this.next=null;
	       }
	   }
        //initial head position the reference of root node and the size of the Linked list.
	    static Node root=null;
	    static int size_of_ll = 0;
	    
	    //inseting the data into LinkedList
	    public static void insert_node(int position, int value) {    
	    	
	        if(position>=1 && position <= size_of_ll + 1){
	        	//new node and data
	             Node temp= new Node();
	             temp.data=value;
               
	             //for first position 
	            if(position==1){
	            	//here add the address of root into new node 
	                temp.next=root;
	                // here is add new element into new position 
	                root=temp;
	            }else{
	            	//head of the node
	               Node prev=root;
	               //traversing the list to find the positioned there we need to add new node
	               for(int i=1;i<position-1;i++){
	            	   prev=prev.next;
	               } 
	               //add the address of the previous next node address(i.e node after the new inserted node that address already 
	               //present in previous node means just before the position of new node ) to new node that the new inserted node
	               // hold the address of the next node that get from previous prev.next
	             temp.next=prev.next;
	             // and replace the address of previous node with new inserted node address that add into the previous node
	             prev.next=temp;

	            }
                     
	            size_of_ll++;
	        }

	         

	    }

	    public static void delete_node(int position) {
	       
	      if(position>=1 && position <= size_of_ll){
	           Node temp= null;
	          if(position==1){
	        	  //remove the single node and put the first element as root element;
	              temp=root;
	              root=root.next;
	          }else{
	        	  //here head of linked list
	                 Node prev=root;
	                 if(prev!=null){
	                	 //find out the position for delete the node
	                 for(int i=1;i<position-1;i++){
	                       prev=prev.next;
	                 }
	                 //there hold the address of deleted node.
	                 temp= prev.next;
	                 //put the address of node that present after the delete node. In previous node(before the delete node) of the list .
	                 prev.next=prev.next.next;
	                 }

	          }
	           size_of_ll--;
	      }
	        
	    }

	    public static void print_ll() {
	        
	       Node n= root;
	       if(n!=null){
	    	   //use for only that first element not contain any space
	      boolean flag=false;
	       while(n!=null){ 
	           if(flag==false){
	               System.out.print(n.data);
	               flag=true;
	           }else
	       System.out.print(" "+n.data);

	       n=n.next;
	       }
	       }
	  
	    }


}
