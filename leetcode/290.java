public class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> map = new HashMap<>();
        String strs[] = str.split(" ");
        if(pattern.length()!=strs.length) return false;
        for(int  i =0; i < pattern.length(); i++){
        	char c = pattern.charAt(i);
        	if(!map.containsKey(c)){
        		if(map.containsValue(strs[i])) return false;
        		map.put(c,strs[i]);
        	}
        	else{
        		if(!map.get(c).equals(strs[i])) return false;
        	}
        }
        return true;
    }
}