public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val < p.val && root.val > q.val) return root;
        if(root.val > p.val && root.val < q.val) return root;
        if(root.val == p.val || root.val == q.val) return root;

        if(root.val > p.val) return lowestCommonAncestor(root.left,p,q);
        else return lowestCommonAncestor(root.right,p,q);
        
    }
}