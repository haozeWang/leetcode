public class Solution {
    public boolean isStrobogrammatic(String num) {
        char c[] = num.toCharArray();

        int i = 0;
        int j = c.length-1;

        while (i < j) {
        	if(c[i] == '8'){
        		if(c[j] != '8') return false;
        	}
        	else if(c[i] == '6'){
        		if(c[j] != '9') return false;
        	}
        	else if(c[i] == '9'){
        		if(c[j] != '6') return false;
        	}
        	else if(c[i] == '0'){
        		if(c[j] != '0') return false;
        	}
            else if(c[i] == '1'){
                if(c[j] != '1') return false;
            }
            else return false;
        	i++;
        	j--;
        }
        if(i == j && (c[i] != '1' && c[i] != '0' &&c[i] != '8' )) return false;
        return true;

    }
}