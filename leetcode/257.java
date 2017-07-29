public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList<>();
        helper(root,list,new String());
        return list;

    }

    public void helper(TreeNode root, List<String> list, String s){
        if(root == null) return;
        
    	if(root.left == null && root.right == null){
            
    		list.add(s+root.val);
    		return;
    	}
        
    	helper(root.left,list,s+root.val+"->");
    	helper(root.right,list,s+root.val+"->");

    }
}