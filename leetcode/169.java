public class Solution {
    public int majorityElement(int[] nums) {
        int num = 0;
        int count = 0;
        for(int i : nums){
        	if(count == 0) {
        		num = i;
        		count = 1;
        	}
        	else if(i == num) count++;
        	else count--;
        }
        count = 0;
        for(int i : nums){
        	if(i==num) count++;
        }
        if(count > nums.length /2) return num;
        else return -1;


    }
}