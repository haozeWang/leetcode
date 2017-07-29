public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
         HashMap<String,Integer> map = new HashMap();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list1.length; i++){
        	map.put(list1[i],-i);
        }

        for(int i = 0; i < list2.length; i++){
        	if(map.containsKey(list2[i])){
        		map.put(list2[i],i-map.get(list2[i]));
        		min = Math.min(map.get(list2[i]),min);
        	}
        }

        List<String> list = new LinkedList<>();

        for(HashMap.Entry<String,Integer> e : map.entrySet()){
        	if(e.getValue() == min) list.add(e.getKey());
        }

        String [] res = new String[list.size()];

        for(int i = 0; i < res.length; i++){
        	res[i] = list.get(i);
        }

        return res;
    }
}