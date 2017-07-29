public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;

      	int i = num1.length()-1;
      	int j = num2.length()-1;

      	while(i >= 0 || j >= 0){
      		int temp1 = i>=0?num1.charAt(i)-'0':0;
      		int temp2 = j>=0?num2.charAt(j)-'0':0;
      		int num = temp2+temp1+carry;
      		carry = num / 10;
      		sb.append(num%10);
            i--;
            j--;
      	}
      	if(carry==1) sb.append("1");

      	return sb.reverse().toString();
    }
}
