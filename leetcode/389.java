public class Solution {
    public char findTheDifference(String s, String t) {
        int []rec = new int[26];

        for(int i = 0; i < s.length(); i++){
        	rec[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < t.length(); i++){
        	rec[t.charAt(i) - 'a']--;
        }

        for(int i = 0;i < rec.length ;i++){
        	if(rec[i] == -1) return (char)('a'+i);
        }
        
        return 'a';
    }


    public char findTheDifference(String s, String t){
    	char c = 0;
    	for(int i = 0; i < s.length(); i++){
    		c ^= s.charAt(i);
    	}

    	for (int i = 0;i < t.length() ; i++) {
    		c ^= t.charAt(i);
    	}

    	return c;
    }
}