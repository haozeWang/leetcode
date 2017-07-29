public class Solution {
    public String reverseWords(String s) {
    	StringBuilder sb = new StringBuilder();
        String strs[] = s.split(" ");
        for(int i = 0; i < strs.length; i++){
        	sb.append(helper(strs[i]));
        	if(i != strs.length - 1) sb.append(" ");
        }
        return sb.toString();

    }

    public String helper(String s){
    	StringBuilder sb = new StringBuilder(s);
    	return sb.reverse().toString();
    }
}