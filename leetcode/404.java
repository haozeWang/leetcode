public class Solution {
	int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root);
        return sum;
    }

    public boolean helper(TreeNode root){
    	if(root.left == null && root.right == null) return true;

    	if(root.left != null) {
    		if(helper(root.left)) sum += root.left.val;
    	}

    	if(root.right != null) helper(root.right);
    }
}