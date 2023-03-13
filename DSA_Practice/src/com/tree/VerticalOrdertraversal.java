package com.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;


// Given a binary tree, return a 2-D array with vertical order traversal of it. Go through the example and image for more details.


// NOTE: If 2 Tree Nodes shares the same vertical level then the one with lesser depth will come first.



// Problem Constraints
// 0 <= number of nodes <= 105



// Input Format
// First and only arument is a pointer to the root node of binary tree, A.



// Output Format
// Return a 2D array denoting the vertical order traversal of tree as shown.



// Example Input
// Input 1:

//       6
//     /   \
//    3     7
//   / \     \
//  2   5     9
// Input 2:

//       1
//     /   \
//    3     7
//   /       \
//  2         9


// Example Output
// Output 1:

//  [
//     [2],
//     [3],
//     [6, 5],
//     [7],
//     [9]
//  ]
// Output 2:

//  [
//     [2],
//     [3],
//     [1],
//     [7],
//     [9]
//  ]


// Example Explanation
// Explanation 1:

//  First row represent the verical line 1 and so on.
//TC:O(N),SC:O(N)
public class VerticalOrdertraversal {

    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) 
    {
        Map<Integer,ArrayList<Integer>> mppad= new HashMap();
        Queue<Pair> q= new LinkedList();
        q.add(new Pair(A,0));
        int min=0;
        int max=0;
        while(q.size()>0)
        {
            Pair removePair=q.remove();
            if(mppad.containsKey(removePair.vl)){
              //  mppad.put(mppad.get(removePair.vl),removePair.node);
     
            }else{
                List<TreeNode> list=new ArrayList<>();;
                list.add(removePair.node);
            //   mppad.put(removePair.vl,list);
                
            }

            if(removePair.node.left!=null){
                q.add(new Pair(removePair.node.left,removePair.vl-1));
            }

            if(removePair.node.right!=null){
                q.add(new Pair(removePair.node.right,removePair.vl+1));
            }

            min=Math.min(min,removePair.vl);
            max=Math.max(max,removePair.vl);
        }

        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        
        for(int i=min;i<max;i++){
            ans.add(mppad.get(min));
        }

        return ans;
    }

     public class Pair
     {
        TreeNode node;
        int vl;
        public Pair(TreeNode node, int vl)
        {
            this.node=node;
            this.vl=vl;
        }
     }

}