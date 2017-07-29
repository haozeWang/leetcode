public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int curr = 0;
        for(int i : nums){
        	if(i == 1){
        		curr++;
        		res = Math.max(curr,res);
        	}
        	else curr = 0;
        }
        return res;
    }
}