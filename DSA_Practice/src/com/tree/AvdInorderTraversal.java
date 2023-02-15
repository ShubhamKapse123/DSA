import java.util.ArrayList;



// Problem Description
// Given a binary tree, return the inorder traversal of its nodes' values.

// NOTE: Using recursion is not allowed.



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

//approach
// You can do this problem easily with recursion, but recursion is not allowed here.

// A stack can help you to avoid recursion. How?

public class AvdInorderTraversal{
    /**
 * Definition for binary tree*/
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
 
public class Solution {
    //TC:O(N)
    //SC:O(N)
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> res= new ArrayList<>();
        Stack<TreeNode> nodeStk= new Stack<>();

        TreeNode curr= A;

        while(curr!=null || nodeStk.size()>0){
        ArrayList
                nodeStk.push(curr);
                curr=curr.left;
            }
            curr=nodeStk.pop();
            res.add(curr.val);
            curr=curr.right;
        }

        return res;
    }
}


}