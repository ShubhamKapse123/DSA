package com.tries;
import java.util.ArrayList;

public class SpellingChecker {
    static TriesNode node;
    public ArrayList<Integer> solve(ArrayList<String> A, ArrayList<String> B) {
        ArrayList<Integer> result= new ArrayList<>();
        TriesNode node= new TriesNode();
        for(int i=0;i<A.size();i++){
            insertTries(node,A.get(i));
        }

        for(int i=0;i<B.size();i++){
            boolean check=search(B.get(i));
            if(check){
                result.add(1);
            }else{
                result.add(0);
            }
        }

        return result;
    }

    static class TriesNode
   {
        boolean eow;
        TriesNode childrens[]=new TriesNode[26];  
        
        TriesNode(){
            for(int i =0;i<26;i++){
            childrens[i]=null;  
            } 
            this.eow=false;
        }
   }


public static void insertTries(TriesNode node,String word)
    {
    TriesNode curr=node;
        for(int i =0;i<word.length();i++){
            int indx=word.charAt(i)-'a';
            if(curr==null){
                curr.childrens[indx]=new TriesNode();
            }
           curr= curr.childrens[indx];
        }
        curr.eow=true;  
    }

    public static boolean search(String word)
    {
    TriesNode curr=node;
        for(int i =0;i<word.length();i++)
        {
            int indx=word.charAt(i)-'a';
            if(curr==null){
                return false;
            }
           curr= curr.childrens[indx];
        }
     return   curr.eow=true;  
    }
}


