package com.hashing;

import java.util.HashSet;
import java.util.Set;

/*Determine if a Sudoku is valid, according to: http://sudoku.com.au/TheRules.aspx

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.



The input corresponding to the above configuration :

["53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"]
A partially filled sudoku which is valid.

Note:

A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
Return 0 / 1 ( 0 for false, 1 for true ) for this problem
*/


/*Solution Approach
Very simple simulation problem. Just need to keep track of the digits seen in every row, every column and every block as defined in the rules.
Whenever you encounter a digit already seen, you know the sudoku is not valid.

Note that this problem will get very complicated if you were 
to determine if the sudoku was solvable.*/
public class ValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] A= {"53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};
        System.out.println(isValidSudoku(A));
	}
	
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int isValidSudoku(final String[] A) {
	        Set<String> result= new HashSet();

	        for(int i=0;i<9;i++){
	            for(int j=0;j<9;j++){
	                char v=A[i].charAt(j);
	                if(v!='.'){
                        if(!result.add(v+" of row "+i)||!result.add(v+" of col "+j)||
                        !result.add(v+" of cube "+i/3+"-"+j/3)){
                            return 0;
                        }
                    }
                }
	        }
			return 1;
	    }

}
