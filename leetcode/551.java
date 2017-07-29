public class Solution {
    public boolean checkRecord(String s) {
        char c[] = s.toCharArray();

        int numOfA = 0;

        for(int i = 0; i < c.length; i++){
        	if(c[i] == 'P') continue;
        	else if(c[i] == 'A'){
        		numOfA ++;
        		if(numOfA >= 2) return false;
        	}
        	else if(c[i] == 'L'){
        		if(i - 2 >= 0 && c[i-1] == 'L' && c[i-2] == 'L') return false;
        	}
        }

        return true;
    }
}