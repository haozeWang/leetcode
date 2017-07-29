public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        Rank []ranks = new Rank[nums.length];
        for(int i = 0;i < nums.length; i++){
        	ranks[i] = new Rank(nums[i],i);
        }

        Arrays.sort(ranks,new Comparator<Rank>(){
        	public int compare(Rank o1, Rank o2){
        		return o2.score - o1.score;
        	}
        });

        String res[] = new String[nums.length];

        for(int i = 0; i < ranks.length; i++){
        	if(i == 0){
        		res[ranks[i].index] = "Gold Medal";
        	}
        	else if(i==1){
        		res[ranks[i].index] = "Silver Medal";
        	}
        	else if(i==2){
        		res[ranks[i].index] = "Bronze Medal";
        	}
        	else res[ranks[i].index] = i+1+"";

        }

        return res;


    }

    class Rank{
    	int score;
    	int index;
    	public Rank(int score, int index){
    		this.score = score;
    		this.index = index;
    	}
    }
}