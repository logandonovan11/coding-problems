//Problem: https://leetcode.com/problems/power-of-four/description/

class Solution {
    public boolean isPowerOfFour(int num) {
        if (num == 0) return false;
        if (num == 1) return true;
        while(num%4 == 0) num /=4;
        return num == 1;
    }
}
