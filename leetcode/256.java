public class Solution {
    public int minCost(int[][] costs) {
        int preR = costs[0][0];
        int preB = costs[0][1];
        int preC = costs[0][2];

        for(int i = 1; i < costs.length; i++){
        	int tempR = costs[i][0] + Math.min(preB,preC);
        	int tempB = costs[i][1] + Math.min(preR,preC);
        	int tempC = costs[i][2] + Math.min(preR,preB);
        	preR = tempR;
        	preB = tempB;
        	preC = tempC;
        }

        return Math.min(Math.min(preR,preB),preC);
    }
}