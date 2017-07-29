public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int []num = new int[26];
        for(int i = 0; i < magazine.length(); i++){
        	num[magazine.charAt(i) - 'a']++;
        }
        for(int i = 0; i < ransomNote.length();i++){
        	num[ransomNote.charAt(i)-'a']--;
        }
        for(int i : num){
        	if(i < 0) return false;
        }
        return true;
    }
}