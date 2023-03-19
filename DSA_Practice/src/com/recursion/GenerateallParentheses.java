package com.recursion;

import java.util.ArrayList;

import java.util.ArrayList;

import java.util.ArrayList;

// Problem Description
// Given an integer A pairs of parentheses, write a function to generate all combinations of well-formed parentheses of length 2*A.



// Problem Constraints
// 1 <= A <= 10



// Input Format
// First and only argument is integer A.



// Output Format
// Return a sorted list of all possible parenthesis.



// Example Input
// Input 1:

// A = 3
// Input 2:

// A = 1


// Example Output
// Output 1:

// [ "((()))", "(()())", "(())()", "()(())", "()()()" ]
// Output 2:

// [ "()" ]


// Example Explanation
// Explanation 1:

//  All paranthesis are given in the output list.
// Explanation 2:

//  All paranthesis are given in the output list.


// Solution Approach
// Again, think recursion.
// At every step, you have two options :
// 1) Add ‘(‘ to the string.
// OR
// 2) Add ‘)’ to the string.
// However, you need to make sure that the number of closing brackets does not exceed the number of opening brackets at any point in time.
// Also, make sure that the number of opening brackets never exceeds n.

// The list of strings would be sorted by default as in our recursive function we first handle the case of ‘(‘ and then ‘)’.

public class GenerateallParentheses{
    public ArrayList<String> generateParenthesis(int A) {
        ArrayList<String> rs= new ArrayList<>();
        generateCurrentParenthesis("",0,0,rs,A);
        return rs;
    }

   static void generateCurrentParenthesis(String brac,int o,int c,ArrayList<String> rsArr,int n){
        if(2*n==brac.length()){
            rsArr.add(brac);
            return;
        }

        if(o<n){
            generateCurrentParenthesis(brac+"(",o+1,c,rsArr,n);
        }

        if(c<o){
             generateCurrentParenthesis(brac+")",o,c+1,rsArr,n);
        }
    }
}