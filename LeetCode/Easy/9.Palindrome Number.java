/* 9. Palindrome Number
Easy

Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

Example 1:
Input: x = 121
Output: true
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Constraints:
-231 <= x <= 231 - 1

*/

class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0){
            return true;
        }
        if(x < 0 || x % 10 == 0){
            return false;
        }
    
    
    int rev = 0;
    while(x > rev){
        int dig = x % 10;
        x = x/10;
        rev =  (rev * 10) + dig ;
    }
    
    if(x == rev || x == rev / 10){
        return true;
    }
    else{
        return false;
    }
}
}


