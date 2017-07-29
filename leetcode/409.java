public class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
        	if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i),1);
        	else map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        int len = 0;
        boolean flag = false;
        for(HashMap.Entry<Character,Integer> i : map.entrySet()){
        	if(i.getValue() % 2 ==0) len += i.getValue();
        	else {
                len+=i.getValue()-1;
                flag = true;
            }
        }
        return len+(flag==true?1:0);
    }


    
}