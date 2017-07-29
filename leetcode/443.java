public class Solution {
    public int countSegments(String s) {

        char c[] = s.toCharArray();
        
        if(c.length == 0) return 0;

        int res = 0;

        for(int i =0; i < c.length ;i ++){
        	if(c[i] != ' ')continue;

        	if(c[i] == ' ' && (i != 0 && c[i-1] != ' ')){
        		res++;
        	}
        }

        if(c[c.length-1] != ' ') res++;

        return res;
    }
}