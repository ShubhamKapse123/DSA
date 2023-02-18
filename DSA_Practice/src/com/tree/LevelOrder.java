import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

import java.util.ArrayList;

// Given a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).



// Problem Constraints
// 1 <= number of nodes <= 105



// Input Format
// First and only argument is root node of the binary tree, A.



// Output Format
// Return a 2D integer array denoting the zigzag level order traversal of the given binary tree.



// Example Input
// Input 1:

//     3
//    / \
//   9  20
//     /  \
//    15   7
// Input 2:

//    1
//   / \
//  6   2
//     /
//    3


// Example Output
// Output 1:

//  [
//    [3],
//    [9, 20],
//    [15, 7]
//  ]
// Output 2:

//  [ 
//    [1]
//    [6, 2]
//    [3]
//  ]


// Example Explanation
// Explanation 1:

//  Return the 2D array. Each row denotes the traversal of each level.

public class LevelOrder{
  
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
 
public class Solution {
    //TC:O(N);
    //SC:O(N)
    public ArrayList<ArrayList<Integer>> solve(TreeNode A) {
        ArrayList<ArrayList<Integer>> rs= new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> levelArr= new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
     
        q.add(A);
        //add null for representing the null node that and also help to move next level  
        q.add(null);
        // this condition we have because it will throw the exception OucalltOfMemoryError
        // because we call remove method so in Queue we don't have any value that why it's throw exception 
        while(q.size()>1){
            //here we are taking the first root value we removing from Queue and if the value is 
            //null then we add the new array that contain the level(node value)
            //after we clear the level array for storing next new level node value.
            //in else we add the all value on perticular level and check the root not or sub root not have any
            //child we add into the Queue.
            
            TreeNode r= q.remove();
            if(r==null){
                rs.add(new ArrayList<>(levelArr));
                q.add(null);
                levelArr.clear();
            }else{            
                levelArr.add(r.val);
                if(r.left!=null){q.add(r.left);}
                if(r.right!=null){q.add(r.right);}
            }

        }
        //here we add last level because of Queue value 
         rs.add(new ArrayList<>(levelArr));
        return rs;
    }
}
  
}