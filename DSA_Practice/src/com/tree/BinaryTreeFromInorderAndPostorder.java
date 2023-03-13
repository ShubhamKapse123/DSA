package com.tree;

import java.util.ArrayList;

// Problem Description
// Given the inorder and postorder traversal of a tree, construct the binary tree.

// NOTE: You may assume that duplicates do not exist in the tree.



// Problem Constraints
// 1 <= number of nodes <= 105



// Input Format
// First argument is an integer array A denoting the inorder traversal of the tree.

// Second argument is an integer array B denoting the postorder traversal of the tree.



// Output Format
// Return the root node of the binary tree.



// Example Input
// Input 1:

//  A = [2, 1, 3]
//  B = [2, 3, 1]
// Input 2:

//  A = [6, 1, 3, 2]
//  B = [6, 3, 2, 1]


// Example Output
// Output 1:

//    1
//   / \
//  2   3
// Output 2:

//    1  
//   / \
//  6   2
//     /
//    3


// Example Explanation
// Explanation 1:

//  Create the binary tree and return the root node of the tree.

// Focus on the postorder traversal, to begin with.
// The last element in the traversal will definitely be the root.
// Based on this information, can you identify the left subtree and right subtree elements? ( Hint: Focus on inorder traversal and root information )

// Once you do that, your problem has now been reduced to a smaller set. Now you have the inorder and postorder traversal for the left and right subtree, and you need to figure them out.
// Divide and conquer.

// Bonus points if you can do it without recursion.

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class BinaryTreeFromInorderAndPostorder {
    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
            if(A.isEmpty()) return null;
        if(B.isEmpty()) return null;

        return buildTreeAll(A,0,A.size()-1,B,0,B.size()-1);
    }

    public TreeNode buildTreeAll(ArrayList<Integer> inoder,int instart,int inend,ArrayList<Integer> postorder,
    int poststart, int postend){
        
        if(instart>inend){
            return null;
        }

        int postVal=postorder.get(postend);
        int rootIdx=-1;
        for(int i=instart;i<=inend;i++){
            if(inoder.get(i)==postVal){
                rootIdx=i;
                break;
            }
        }
      
      int leftsubTree=rootIdx-instart;
      TreeNode root= new TreeNode(postVal);

    root.left=buildTreeAll(inoder,instart,rootIdx-1,postorder,poststart,poststart+leftsubTree-1);
    root.right=buildTreeAll(inoder,rootIdx+1,inend,postorder,poststart+leftsubTree,postend-1);

    return root;
    }
}