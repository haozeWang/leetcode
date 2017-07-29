public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
        	if(set.constains(i)) return false;
        	else set.add(i);
        }
        return true;
    }
}