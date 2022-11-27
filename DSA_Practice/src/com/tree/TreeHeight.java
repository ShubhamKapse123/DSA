package com.tree;

public class TreeHeight {
	

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
	
	 class Solution {
	    public int solve(TreeNode A) {
	        if(A==null){
	            return 0;
	        }

	        int lh=solve(A.left);
	        int rh=solve(A.right);

	        return Math.max(lh,rh)+1;
	        
	    }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
