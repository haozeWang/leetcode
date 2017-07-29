public class Solution {
    public int searchInsert(int[] nums, int target) {
        int begin = 0;
        int end = nums.length-1;

        while (begin < end) {
        	int mid = begin + (end - begin)/2;
        	if(nums[mid] == target) return mid;
        	if(nums[mid] < target) begin = mid+1;
        	else end = mid;
        }

        
        if(nums[begin] == target) return begin;
        else if(nums[begin] < target) return begin+1;
        else return begin;
        

        
    }
}