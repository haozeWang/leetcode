public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int [][]res = new int[r][c];
        int row = nums.length;
        int col = nums[0].length;
        if(row * col != r * c) return nums;

        for(int i = 0; i < r; i++){
        	for(int j = 0; j < c; j++){
        		int sum = i*c + j;
        		int x = sum / col;
        		int y = sum % col;
        		res[i][j] = nums[x][y];
        	}
        }

        return res;
    }
}