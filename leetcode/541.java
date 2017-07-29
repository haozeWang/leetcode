public class Solution {
    public String reverseStr(String s, int k) {
    	StringBuilder sb = new StringBuilder();
       
        int j = 0;
        int i = 2*k >s.length()?s.length():2*k;
        for(; i <= s.length(); i = ((i + 2*k)>s.length()?s.length():i+2*k), j = j+2*k){
            if(j > s.length()) break;
            sb.append(new StringBuilder(s.substring(j,j+k>i?i:j+k)).reverse());
            if(j+k < i) sb.append(s.substring(j+k,i));
        }
        
        return sb.toString();
    }


    
    public String reverseStr(String s, int k) {
        char c[] = s.toCharArray();

    	int i = 0;
    	int len = s.length();

    	while(i < len){
    		int j = i+k>len?len-1:i+k-1;
    		swap(i,j,c);
    		i = i + 2*k;

    	}
    	return String.valueOf(c);


    }

    public void swap(int i, int j, char []c){
    	while(i < j){
    		char temp = c[i];
    		c[i] = c[j];
    		c[j] = temp;
    		i++;
    		j--;
    	}
    }
}