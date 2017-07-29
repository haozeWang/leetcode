public class Solution {
    
    public int minDepth(TreeNode root) {
          if(root == null) return 0;
          return helper(root);
    }	

    public int helper(TreeNode root){
    	if(root.left == null && root.right == null) return 1;
    	int left = Integer.MAX_VALUE;
    	int right = Integer.MAX_VALUE;
    	if(root.left != null) left = helper(root.left);
    	if(root.right != null) right = helper(root.right);
    	return Math.min(left,right)+1;

    }
}