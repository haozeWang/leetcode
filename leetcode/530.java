public class Solution {

	int min = Integer.MIN_VALUE;

    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return min;
    }

    public int[] helper(TreeNode root){
    	if(root.left == null && root.right == null) return new int[]{root.val,root.val};

    	int left[] = new int[2];
    	int right[] = new int[2];
    	int res[] = new int[2];
    	if(root.left != null) {
    		left = helper(root.lft);
    		min = Math.min(root.val - left[1]);
    		res[0] = left[0];
    	}
    	else{
    		res[0] = root.val;
    	}
    	if(root.right != null) {
    		right = helper(root.right);
    		min = Math.min(right[0] - root.val);
    		res[1] = right[1];
    	}
    	else {
    		res[1] = root.val;
    	}

    	return res;




    }

    TreeNode pre; 

    public int getMinimumDifference(TreeNode root){
    	helper(root);
    	return min;
    }	

    public void helper(TreeNode root){
    	if(root == null) return;
    	helper(root.left);
    	if(pre != null && root.val - pre.val < min) min = root.val - pre.val;
    	pre = root;
    	helper(root.right);
    }


}