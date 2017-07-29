public class Solution {
    public int numberOfBoomerangs(int[][] points) {
         HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for(int i =0; i < points.length; i++){
        	map = new HashMap<>();
        	for(int j = 0; j < points.length; j++){
        		if(j == i) continue;
        		int dis = (int)Math.pow(points[j][0]-points[i][0],2) + (int)Math.pow(points[j][1] - points[i][1],2);
        		if(!map.containsKey(dis)) map.put(dis,1);
        		else map.put(dis,map.get(dis)+1);
        		res += 2*(map.get(dis)-1);
        	}
        }

        return res;
    }
}