package com.tree;

public class IdenticalBinaryTrees {
	


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
	    public int isSameTree(TreeNode A, TreeNode B) {
	        if(A==null&&B==null){
	            return 1;
	        }

	        if((A==null&&B!=null)||(A!=null&&B==null)||(A.val!=B.val)){
	            return 0;
	        }

	        
	        int anode=isSameTree(A.left,B.left);
	        int bnode=isSameTree(B.right,A.right);

	        if(anode==bnode){
	            return 1;
	        }


	        return 0;       
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
