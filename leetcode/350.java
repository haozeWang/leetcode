public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums1){
        	if(!map.containsKey(i)) map.put(i,1);
        	else map.put(i,map.get(i)+1);
        }
        List<Integer> res = new LinkedList<>();
        for(int i : nums2){
        	if(map.containsKey(i) && map.get(i) > 0) {
        		res.add(i);
        		map.put(i,map.get(i)-1);
        	}
        }
        int [] num = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
        	num[i] = res.get(i);
        }
        return num;
    }
}