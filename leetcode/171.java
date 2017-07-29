public class Solution {
    public int titleToNumber(String s) {
        int len = s.length()-1;

        int sum = 0;
        for(int i = 0; i < s.length(); i++){
        	sum += (s.charAt(i)-'A'+1)*Math.pow(26,len);
        	len--;
        }

        return sum;
    }
}