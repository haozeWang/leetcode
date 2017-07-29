public class Solution {
    public int removeDuplicates(int[] nums) {
    	int left = -1;
        for(int i = 0; i < nums.length; i++){
        	if(i == 0 || nums[i] != nums[i-1]) {
        		left++;
        		nums[left] = nums[i];
        	}
        }
        return left+1;
    }
}