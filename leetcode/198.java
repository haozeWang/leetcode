public class Solution {
    public int rob(int[] nums) {
    	

        int dp1 = 0;
        int dp2 = 0;

        for(int i : nums){
        	int temp = Math.max(i + dp1,dp2);
        	dp1 = dp2;
        	dp2 = temp;
        }

        return Math.max(dp1,dp2);

    }
}