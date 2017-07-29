public class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet();
        int kind = 0;
        for(int i = 0; i < candies.length; i++){
        	set.add(candies[i]);
        }
        kind = set.size();
        if(candies.length / 2 > kind) return kind;
        else return candies.length/2;
    }
}