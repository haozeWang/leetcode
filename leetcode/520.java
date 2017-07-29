public class Solution {
    public boolean detectCapitalUse(String word) {
        char c[] = word.toCharArray();
        boolean first = Character.isUpperCase(c[0]);
        int num = 0;
        for(char s : c){
        	if(Character.isUpperCase(s)) num++;
        }
        if(num == 0) return true;
        if(num == word.length()) return true;
        else if(num == 1 && first) return true;
        return false;
    }
}