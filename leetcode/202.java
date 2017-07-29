public class Solution {
    public boolean isHappy(int n) {
       
        HashSet<Integer> set = new HashSet();
        return helper(n,set);
    }

    public boolean helper(int n, HashSet<Integer> set){
    	if(set.contains(n)) return false;
    	set.add(n);
    	int res = 0;
    	while(n != 0){
    		res += (int)Math.pow(n%10,2);
            n = n /10;
    	}
    	if(res == 1) return true;
    	return helper(res,set);
    	


    }

    
}