public class Solution {

	static int[][] move = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

    public int islandPerimeter(int[][] grid) {
    	boolean visited[][] = new boolean[grid.length][grid[0].length];
    	for(int i = 0; i < grid.length; i++){
    		for(int j = 0; j < grid[0].length; j++){
    			if(grid[i][j] == 1){
    				return helper(grid,i,j,visited);
    			}
    		}
    	}
    	return 0;
        
    }

    public int helper(int [][]grid, int row, int col, boolean [][]visited){
    	if(row < 0 || row > grid.length || col < 0 || col > grid[0].length || grid[row][col] == 0) return -1;
    	if(visited[row][col]) return 0;
    	int res = 0;
    	visited[row][col] = true;
    	for(int i = 0; i < move.length; i++){
    		int temp = helper(grid,row+move[i][0],col+move[i][1],visited);
    		if(temp != -1) res += temp;
    		else res = res +1;
    	}
    	return res;

    }
}