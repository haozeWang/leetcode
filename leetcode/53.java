public class Solution {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int max = Integer.MIN_VALUE;
        for(int i : nums){
        	if(pre > 0) {
        		pre = i+pre;
        		
        	}
        	else pre = i;

        	max = Math.max(pre,max);
        }

        return max;
    }
}