public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        
        for(int i : nums1){
        	set.add(i);
        }
        for(int i : nums2){
        	if(set.contains(i)) res.add(i);
        }
        int j = 0;
        int [] num = new int[res.size()];
        for(int i : res){
        	num[j] = i;
        	j++;
        }
        return num;

    }
}