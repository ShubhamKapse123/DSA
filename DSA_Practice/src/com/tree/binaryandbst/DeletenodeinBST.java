package com.tree.binaryandbst;

// Problem Description
// Given a Binary Search Tree(BST) A. If there is a node with value B present in the tree delete it and return the tree.

// Note - If there are multiple options, always replace a node by its in-order predecessor


// Problem Constraints
// 2 <= No. of nodes in BST <= 105
// 1 <= value of nodes <= 109
// Each node has a unique value


// Input Format
// The first argument is the root node of a Binary Search Tree A.
// The second argument is the value B.


// Output Format
// Delete the given node if found and return the root of the BST.


// Example Input
// Input 1:

//             15
//           /    \
//         12      20
//         / \    /  \
//        10  14  16  27
//       /
//      8

//      B = 10

// Input 2:

//             8
//            / \
//           6  21
//          / \
//         1   7

//      B = 6



// Example Output
// Output 1:

//             15
//           /    \
//         12      20
//         / \    /  \
//        8  14  16  27

// Output 2:

//             8
//            / \
//           1  21
//            \
//             7



// Example Explanation
// Explanation 1:

// Node with value 10 is deleted 
// Explanation 2:

// Node with value 6 is deleted 




public class DeletenodeinBST {


 //Definition for binary tree
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
 

    public TreeNode solve(TreeNode A, int B) {
        TreeNode parent=null;
        TreeNode current=A;

// if the node with the given key is not found, return the original tree
        if(current==null){
            return A;
        }

    // find the node with the given B
        while(current!=null&&current.val!=B){
            parent=current;
            if(B<current.val){
                current=current.left;
            }else{
                current=current.right;
            }
        }

// if the deleted node has two children, replace it with its in-order predecessor 

        if(current.left!=null&&current.right!=null){
            TreeNode par=current;
            TreeNode subpar=current.left;
            

        while(subpar.right!=null){
            par=subpar;
            subpar=par.right;
        }
            current.val=subpar.val;
            current=subpar;
            parent=par;

        }
// if the node has one or no children, delete it by updating its parent's child pointer
        TreeNode child;
        if(current.left!=null){
            child=current.left;
        }else{
            child=current.right;
        }

        if(parent==null){
            A=child;
        }else if(parent.right==current){
            parent.right=child;
        }else{
            parent.left=child;
        }

        return A;
    }
}

