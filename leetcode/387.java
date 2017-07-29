public class Solution {
    public int firstUniqChar(String s) {
        int num[] = new int[26];
        for(int i = 0; i < s.length(); i++){
        	num[s.charAt(i) - 'a']++;
        }
        for(int i =0; i < s.length();i++){
        	int temp = num[s.charAt(i)-'a'];
        	if( temp == 1) return i;
        }
        return -1;
    }
}