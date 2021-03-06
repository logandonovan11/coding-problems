//Problem: https://leetcode.com/problems/reshape-the-matrix/discuss/

public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length, m = nums[0].length;
        if (r*c != n*m) return nums;
        int[][] result = new int[r][c];
        for (int i = 0; i < r*c; i++){
            result[i/c][i%c] = nums[i/m][i%m];
        }
        return result;
    }
}
