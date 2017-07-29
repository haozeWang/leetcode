public class Solution {
    public String countAndSay(int n) {
    	String temp = "1";
        for(int i = 1; i < n; i++){
        	temp = helper(temp);
        }

        return temp;
    }


    public String helper(String s){
    	char c[]  = s.toCharArray();
    	StringBuilder sb = new StringBuilder();
    	int i = 0;
    	int count = 1;
    	while (i < c.length) {
    		while(i < c.length-1 && c[i] == c[i+1]) {
    			i++;
    			count++;
    		}
    		sb.append(count).append(c[i]);
    		count = 1;
    		i++;
    	}
    	
    	return sb.toString();


    }
}