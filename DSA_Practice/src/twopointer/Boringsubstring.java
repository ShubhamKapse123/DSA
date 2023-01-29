package twopointer;

/*Problem Description
You are given a string A of lowercase English alphabets. Rearrange the characters of the given string A such that there is no boring substring in A.

A boring substring has the following properties:

Its length is 2.
Both the characters are consecutive, for example - "ab", "cd", "dc", "zy" etc.(If the first character is C then the next character can be either (C+1) or (C-1)).
Return 1 if it is possible to rearrange the letters of A such that there are no boring substrings in A else, return 0.



Problem Constraints
1 <= |A| <= 105



Input Format
The only argument given is a string A.



Output Format
Return 1 if it is possible to rearrange the letters of A such that there are no boring substrings in A else, return 0.



Example Input
Input 1:

 A = "abcd"
Input 2:

 A = "aab"


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 String A can be rearranged into "cadb" or "bdac" 
Explanation 2:

 No arrangement of string A can make it free of boring substrings.*/



public class Boringsubstring {

	public static void main(String[] args) {
		
		solve("gbedggcjac");

	}
	
	static int solve(String A) {
        int arr[]=new int [26];

// this array we use for store the frequency of every index that present  between 1 to 26
        for(int i=0;i<A.length();i++){
            arr[A.charAt(i)-'a']++;
        }
// here we check the current element  + previous element + next ele should be equals to length of String
// then that is not the boring substring 
        for(int j=1;j<arr.length-1;j++){
            if((arr[j]+arr[j-1]+arr[j+1])==A.length()){
                return 0;
            }
        }

        return 1;
    }
}
