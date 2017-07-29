public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if(root == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
        	int size = queue.size();
        	List<Integer> temp = new LinkedList<>();
        	while(size >0){
        		TreeNode node = queue.poll();
        		temp.add(node.val);
        		if(node.left != null) queue.add(node.left);
        		if(node.right != null) queue.add(node.right);
        		size--;
        	}
        	list.add(0,temp);
        }
        return list;

    }
}