package com.tree.binaryandbst;
// 1 <= Number of nodes in binary tree <= 105

// 1 <= B , C <= 105



// Input Format
// First argument is a root node of the binary tree, A.

// Second argument is an integer B.

// Third argument is an integer C.



// Output Format
// Return the LCA of the two nodes



// Example Input
// Input 1:

//             15
//           /    \
//         12      20
//         / \    /  \
//        10  14  16  27
//       /
//      8

//      B = 8
//      C = 20
// Input 2:

//             8
//            / \
//           6  21
//          / \
//         1   7

//      B = 7
//      C = 1


// Example Output
// Output 1:

//  15
// Output 2:

//  6


// Example Explanation
// Explanation 1:

//  The LCA of node 8 and 20 is the node 15.
// Explanation 2:

//  The LCA of node 7 and 1 is the node 6.

// For Binary search tree, while traversing the tree from top to bottom the first node whose value 
// lies in the range [min(B, C), max(B, C)] is the LCA of B and C.

// So just recursively traverse the BST , if current node value is greater than both B and C, 
// then the LCA lies in the left subtree of the current node. If it is smaller than both B and C, 
// then the LCA lies on the right subtree. Otherwise, the current node is the LCA

// Time Complexity : O(H)
// Space Complexity : O(H)
// where H is the height of the BST

public class LCAinBST {

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

    public int solve(TreeNode A, int B, int C) {
        
        TreeNode curr=A;
        
        while(curr!=null){
            //here we check the two node value is less than parent value then we make the left child as
            //parent and some proccess we are doing child as well up do all notes if both conditon not pass 
            // simply we are return the node that is the our LCA
            if(B<curr.val&&C<curr.val){
                curr=curr.left;
        }else if(B>curr.val&&C>curr.val){
            curr=curr.right;
        }else{
          return curr.val;
        }
        }
        return curr.val;
    }

}
