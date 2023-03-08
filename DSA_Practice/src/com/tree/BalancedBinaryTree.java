package com.tree;

// Problem Description
// Given a root of binary tree A, determine if it is height-balanced.

// A height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.



// Problem Constraints
// 1 <= size of tree <= 100000



// Input Format
// First and only argument is the root of the tree A.



// Output Format
// Return 0 / 1 ( 0 for false, 1 for true ) for this problem.



// Example Input
// Input 1:

//     1
//    / \
//   2   3
// Input 2:

 
//        1
//       /
//      2
//     /
//    3


// Example Output
// Output 1:

// 1
// Output 2:

// 0


// Example Explanation
// Explanation 1:

// It is a complete binary tree.
// Explanation 2:

// Because for the root node, left subtree has depth 2 and right subtree has depth 0. 
// Difference = 2 > 1.

// Solution Approach
// A tree is balanced if :
// 1) Left subtree is balanced
// 2) Right subtree is balanced
// 3) The difference in the height of the left and right subtree is at most 1.

// Can you think of a way to simulate that with recursion?
// Note that depth of a tree can also be calculated recursively as max(depth(rightSubtree), depth(leftSubtree)) + 1.

 // Definition for binary tree
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }
 



public class BalancedBinaryTree {
    public int isBalanced(TreeNode A) {
        if(checkBal(A)==0) return 0;
      return 1;       
    }

    public int checkBal(TreeNode A){
        if(A==null) return 1;

       int leftval= checkBal(A.left);
       int rightval= checkBal(A.right);

        if(leftval==0||rightval==0) return 0;
        //take absolut value for the -1
        if(Math.abs(leftval-rightval)>1) return 0;
        

        return  Math.max(leftval, rightval)+1;
    }

    

}