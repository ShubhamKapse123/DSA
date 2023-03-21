package com.tree;

import java.util.ArrayList;

class TopViewOfBinarytree{
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> list= new ArrayList<>();
     TreeNode temp=A;
     //first travering the left and add into result array
     while(temp!=null){
        list.add(temp.val);
        temp=temp.left;
     }
//then travering the right and add into result array
     temp=A.right;

    while(temp!=null){
        list.add(temp.val);
        temp=temp.right;
     }

       return list;
   }

}