public class Solution {
    public int[] constructRectangle(int area) {
        int max = (int)Math.sqrt(area);
        for(int i = max; i >=0; i--){
        	if((area / i) * i == area ){
        		return new int[]{area/i,i};
        	}
        }
        return new int[]{0,0};
    }
}