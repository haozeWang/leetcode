public class Solution {
    public boolean canPermutePalindrome(String s) {
       Set<Character> set = new HashSet<>();
       for(int i = 0; i < s.length(); i++){
       		char c = s.charAt(i);
       		if(!set.contains(c)){
       			set.add(c);
       		}
       		else set.remove(c);
       }
       if(set.size() == 0 || set.size() == 1) return true;
       else return false;
    }
}