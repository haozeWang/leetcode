public class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int []num = new int[26];
        List<Integer> res = new LinkedList<>();

        for(int i = 0; i < p.length(); i++){
        	num[p.charAt(i)-'a']++;
        }

        int  j = 0;	
        int count = p.length();

        for(int i = 0;  i < s.length(); i++){
        	if(p.indexof(s.charAt(i))!=-1 && num[s.charAt(i)-'a'] > 0) {
        		nums[s.charAt(i)-'a']--;
        		count--;
        		if(count == 0) {
        			res.add(s.substring(j,i+1));
        			nums[s.charAt(j)-'a']++;
        			count ++;
        		}
        	}
        	else{
        		j = i+1;
        	}

        }

        return res;

    }
}