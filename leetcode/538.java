public class Solution {
	int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        
    	return helper(root);

    }

    public TreeNode helper(TreeNode root){
    	if(root == null) return null;
    	
    	TreeNode right = helper(root.right);

    	TreeNode node = new TreeNode(root.val + sum);

    	sum += root.val;

    	TreeNode left = helper(root.left);

    	node.left = left;
    	node.right = right;

    	return node;
    }

}