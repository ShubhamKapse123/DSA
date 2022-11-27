package com.LinkedList;

import java.util.ArrayList;

/*You are given a nested list of integers nestedList. Each element is either an integer or a list whose elements may also be integers or other lists. Implement an iterator to flatten it.

Implement the NestedIterator class:

NestedIterator(List nestedList) Initializes the iterator with the nested list nestedList.
int next() Returns the next integer in the nested list.
boolean hasNext() Returns true if there are still some integers in the nested list and false otherwise.

Example 1:
Input: nestedList = [[1,1],2,[1,1]]
Output: [1,1,2,1,1]
Explanation: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].
Example 2:
Input: nestedList = [1,[4,[6]]]
Output: [1,4,6]
Explanation: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].
Constraints:
The sum of integers in all cases does not exceed 1e5.
The values of the integers in the nested list are in the range [-1e6, 1e6].
*/
public class FlattenNestedListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	// public class Main {
//  public static void main(String[] args) {
     
//  }
 
//  // This is the interface that allows for creating nested lists.
//  // You should not implement it, or speculate about its implementation.
  class NestedInteger {
     
    NestedInteger(int x) {
      }
           // Return true if this NestedInteger holds a single integer, rather than a nested list.
      boolean isInteger() {
		return false;
      }

//      // Return the single integer that this NestedInteger holds, if it holds a single integer.
//      // The result is 1e9 if this NestedInteger holds a nested list.
     int getInteger() {
		return 0;
         
     }

//      // Return the nested list that this NestedInteger holds, if it holds a nested list.
//      // The result is an empty ArrayList if this NestedInteger holds a single integer.
      ArrayList<NestedInteger> getList() {
		return null;
         
     }
 }

class NestedIterator {
//This is the new list that we create
 ArrayList<Integer> mainlist;
 int n;
 //index for pass into next method
 int index;

     NestedIterator(ArrayList<NestedInteger> nestedList) {
     mainlist = new ArrayList<>();
     //here using the recursion for find the nested value and store into list and finally return this list;
     recur(nestedList);
     n=mainlist.size();
     index=0;
     }

     //Recursion function
     void recur(ArrayList<NestedInteger> nestedList){
         for(int i=0;i<nestedList.size();i++){
             if(nestedList.get(i).isInteger()){
                 mainlist.add(nestedList.get(i).getInteger());
             }else{
                 recur(nestedList.get(i).getList());
             }
         }
     }

     int next() {
      return mainlist.get(index++);
     }

     boolean hasNext() {
         return index<n?true:false;
     }
}

}
