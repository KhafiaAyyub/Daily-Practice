/* 50. Pow(x, n)
Medium

Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Input: x = 2.00000, n = 10
Output: 1024.00000

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 

Constraints:
-100.0 < x < 100.0
-231 <= n <= 231-1
-104 <= xn <= 104

*/

class Solution {
    public double myPow(double x, double n) {
            long l = Math.abs((long) n);
            double ans = 1;
            while (l > 0) {
                if ((l & 1) == 1)
                    ans *= x;
                x *= x;
                l >>= 1;
            }
            return n < 0 ? 1 / ans : ans;
        }
}

