public class Solution {
    public int pathSum(TreeNode root, int sum) {
     public int pathSum(TreeNode root, int sum) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        return helper(root,sum,0,map);
        
    }


    public int helper(TreeNode root, int target, int currsum, HashMap<Integer,Integer> map){
    	if(root == null) return 0;

    	currsum += root.val;

    	int res = map.getOrDefault(currsum-target, 0);

    	map.put(currsum,map.getOrDefault(currsum,0)+1);

    	res += helper(root.left, target,currsum,map) + helper(root.right, target,currsum,map);

    	map.put(currsum,map.get(currsum)-1);

    	return res;

    }

    int res = 0;

    public int pathSum(TreeNode root, int sum){
        
    	helper(root,sum,0);
    	if(root != null)
        {pathSum(root.left,sum);
    	pathSum(root.right,sum);
        }
    	return res;
    }

    public void helper(TreeNode root, int target, int curr){
    	if(root == null) return ;

    	if(curr + root.val == target) res++;

    	helper(root.left,target,curr+root.val);
    	helper(root.right,target,curr+root.val);
    }
}