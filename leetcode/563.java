public class Solution {
	int sum = 0;
    public int findTilt(TreeNode root) {
    	helper(root);
    	return sum;
    }

    public int helper(TreeNode root){
    	if(root == null) return 0;
    	int  left = findTilt(root.left);
    	int right = findTilt(root.right);
    	sum += Math.abs(right - left);
    	return left+ right + root.val;
    }


}