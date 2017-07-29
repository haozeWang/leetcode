public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int res[] = new int[2];

        while (i < j){
        	int num = numbers[i] + numbers[j];
        	if(num == target) return new int[]{i+1,j+1};
        	else if(num < target) i++;
        	else j--;
        }
        return res;
    }
}