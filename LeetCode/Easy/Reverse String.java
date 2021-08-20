/* 344. Reverse String
Easy

Write a function that reverses a string. The input string is given as an array of characters s.

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Constraints:
1 <= s.length <= 105
s[i] is a printable ascii character.

*/


 class Solution {
    public void reverseString(char[] s) {
        
        int i = 0;
        int j = s.length-1;
        
        while(i<=j){
           char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            
            i++;
            j--;
            
        }
    }
}
