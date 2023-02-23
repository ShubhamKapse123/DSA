package com.tree.binaryandbst;

// Given a Binary Search Tree A. Check whether there exists a node with value B in the BST.


// Problem Constraints
// 1 <= Number of nodes in binary tree <= 105

// 0 <= B <= 106



// Input Format
// First argument is a root node of the binary tree, A.

// Second argument is an integer B.



// Output Format
// Return 1 if such a node exist and 0 otherwise



// Example Input
// Input 1:

//             15
//           /    \
//         12      20
//         / \    /  \
//        10  14  16  27
//       /  \    /      \
//      8   -1  -1      -1

//      B = 16
// Input 2:

//             8
//            / \
//           6  21
//          / \
//         1   7

//      B = 9


// Example Output
// Output 1:

//  1
// Output 2:

//  0


// Example Explanation
// Explanation 1:

//  Node with value 16 is present.
// Explanation 2:

//  There is no node with value 9.

//Approach
// For a node, we check if its value is equal to B.
// If the value is less than B, then we check in the right subtree of the node.
// If the value if more than B, then we check in the left subtree of the node.


// Time Complexity: O(N)
// Space Complexity : O(1)

// where N is the number of nodes in the BST
 
 
public class SearchinBST {
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

public static void main(String[] args) {
    
}

    public int solve(TreeNode A, int B) {
        TreeNode temp= A;
        while(temp!=null){
            if(temp.val==B)
            {
              return 1;
              //here use BST properties that is means the parent node left side all value 
              //less then parent value and right side all value is greater than parent value
              // if  B value is not in the tree then return 0 beacause it is not present in current tree.
            }else if(B>temp.val){
                temp=temp.right;
            }else{
                temp=temp.left;
            }
        }

        return 0;
    }
}
 