public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int row = Integer.MAX_VALUE;
        int col = Integer.MAX_VALUE;
        if(ops.length == 0) return m*n;
        for(int i = 0; i < ops.length; i++){
        	row = Math.min(row,ops[i][0]);
        	col = Math.min(col,ops[i][1]);
        }

        return row*col;

    }
}