package com.LinkedList;

/*Design and implement a Linked List data structure.
A node in a linked list should have the following attributes - an integer value and a pointer to the next node. It should support the following operations:

insert_node(position, value) - To insert the input value at the given position in the linked list.
delete_node(position) - Delete the value at the given position from the linked list.
print_ll() - Print the entire linked list, such that each element is followed by a single space (no trailing spaces).
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
When there is a case of print_ll(),  Print the entire linked list, such that each element is followed by a single space. There should not be any trailing space.
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




/*Solution Approach
We will maintain the head of the LinkedList.

For Insert operation - Firstly, we will traverse the list and keep two pointers, current and previous.
So if the position is 1, we will add the node in the beginning and update the head.
Otherwise, we will traverse the list up to the desired position and add the node by making the current node, the next node of the
newly added node, and the next node of the previous node will be the newly added node.

For Print LinkedList Operation - We will print the data of all the nodes by traversing through the list and stop
when our current pointer becomes null.

For Delete LinkedList Operation - We will traverse the list up to the desired position and keep track of two pointers, current and previous.
If the position is 1, we will make the new head of the list the next element of the last head.
Otherwwise, make the next element of the previous node the next element of the current node. At last, free the pointer of the current node.*/


public class Linked_List {
static class  LinkedNode{
public  int val;
 public LinkedNode next;

 LinkedNode(int x){
     this.val=x;
     this.next=null;
 }
 }

 static LinkedNode head=null;
 static int length=0;


 public static void insert_node(int position, int value) {
  LinkedNode node= new LinkedNode(value);

  //insert at head
  if(position<=0) return;

  //insert at first;
  else if(position==1){
      node.next=head;
      head=node;
  }

  //insert at last

  else if(position==length+1){
         
     LinkedNode temp=head;

     while(temp.next!=null){
         temp=temp.next;
     }

     node.next=temp.next;
     temp.next=node;
  }

  //insert in between

  else if(position>1&&position<=length){
      LinkedNode temp = head;

      for(int i=1;i<position-1;i++){
          temp=temp.next;
      }

      node.next=temp.next;
      temp.next=node;

  }else{// new length of LinkedNode list
      return;
  }
     length++;
 }
 

 public static void delete_node(int position) {
   
   if(position<=0) return;

   else if(position==1){ //delete ele at first position
   if(head!=null){
       head=head.next;
   }else{
       return;
   }
   }

  else if(position==length){//delete at last
       LinkedNode temp=head;
       while(temp.next.next!=null){
           temp=temp.next;
       }
     temp.next=null;

   }


  else if(position>1&&position<length){// delete between
       LinkedNode temp=head;
       for(int i=1;i<position-1;i++){
           temp= temp.next;
       }
       temp.next=temp.next.next;
   }

   else{
       return;
   }
     length--;
 }

 public static void print_ll() {
     // Output each element follow
     
     LinkedNode temp= head;

     while(temp.next!=null){
         System.out.print(temp.val+" ");
         temp=temp.next;
     }
     System.out.print(temp.val);
 }

 






	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
