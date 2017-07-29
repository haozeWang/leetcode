public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }


    public TreeNode helper(int []nums, int left, int right){
    	if(left > right) return null;
    	if(left == right) return new TreeNode(nums[left]);

    	int mid = nums[(left+right)/2];
    	int index = (left+right)/2;

    	TreeNode node = new TreeNode(mid);

    	node.left = helper(nums, left, index-1);
    	node.right = helper(nums,index+1,right);
    	return node;
    }
}