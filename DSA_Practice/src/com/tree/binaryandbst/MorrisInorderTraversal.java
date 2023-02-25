package com.tree.binaryandbst;

import java.util.ArrayList;

// Problem Description
// Given a binary tree, return the inorder traversal of its nodes' values.

// NOTE: Using recursion and stack are not allowed.



// Problem Constraints
// 1 <= number of nodes <= 105



// Input Format
// First and only argument is root node of the binary tree, A.



// Output Format
// Return an integer array denoting the inorder traversal of the given binary tree.



// Example Input
// Input 1:

//    1
//     \
//      2
//     /
//    3
// Input 2:

//    1
//   / \
//  6   2
//     /
//    3


// Example Output
// Output 1:

//  [1, 3, 2]
// Output 2:

//  [6, 1, 3, 2]


// Example Explanation
// Explanation 1:

//  The Inorder Traversal of the given tree is [1, 3, 2].
// Explanation 2:

//  The Inorder Traversal of the given tree is [6, 1, 3, 2].


// The Morris Inorder Traversal algorithm is as follows :-

// 1) Initialize the root as the current node.

// 2) While current is not null, check if current has a left child.

// 3) If current does not have a left child, append current node value to our answer 
//    and update it to point to the node on the right of current.

// 4) Otherwise, make current as the right child of its inorder predecessor.

// 5) Update current to its left node.


// Time Complexity : O(N)
// Space Complexity : O(1)
// where N = number of nodes in A


public class MorrisInorderTraversal {
    //TC: O(N) SC:O(1)
    public ArrayList<Integer> solve(TreeNode A) {
        
        ArrayList<Integer> rs= new ArrayList<>();

        TreeNode curr=A;

        while(curr!=null){
            if(curr.left==null){
                rs.add(curr.val);
                curr=curr.right;
            }else{

                TreeNode temp=curr.left;

                while(temp.right!=null&&temp.right!=curr){
                    temp=temp.right;
                }

                if(temp.right==null){
                    //make the connetion
                    temp.right=curr;
                    curr=curr.left;
                }else{
                    //break the connetion
                    temp.right=null;
                    rs.add(curr.val);
                    curr=curr.right;
                }

            }

        }
        
        return rs;          

    }
}
