public class Solution {
   public int hammingDistance(int x, int y) {
    	int temp = x ^ y;
    	return count(temp);
    }

    public int count(int num){
    	int count = 0;
    	while(num > 0){
    		count += num & 1;
    		num >>= 1;
    	}
    	return count;
    }
}