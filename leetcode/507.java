public class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        int sign = 1;
        if(num < 0) {
            num = -num;
            sign = -1;
        }
        while(num != 0){
        	sb.append(num % 7);
        	num = num / 7;
        }

        String res = sb.reverse().toString();

        if(sign == -1) return "-"+res;

        else return res;

    }
}