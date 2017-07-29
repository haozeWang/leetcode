public class Solution {
    public int findComplement(int num) {
        int sum = 0;
        int i = 0;
        while(sum < num){
        	sum += Math.pow(2,i);
        	i++;
        }
        return sum - num;
    }
}