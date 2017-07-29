public class Solution {
    public int depthSum(List<NestedInteger> nestedList) {
    	return helper(nestedList,1);
    }

    public int helper(List<NestedInteger> nestedList, int depth){
    	int res = 0;
        for(NestedInteger i : nestedList){
        	if(i.isInteger()){
        		res += depth * i.getInteger();
        	}
        	else{
        		res += helper(i.getList(),depth+1);
        	}
        }
        return res;
    }
}