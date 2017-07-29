public class Solution {
    public String tree2str(TreeNode t) {
    	
      	if(t == null) return new String("");
      	if(t.left == null && t.right == null) return t.val+"";

      	String left = tree2str(t.left);
      	String right = "";
      	if(t.right != null) right = tree2str(t.right);

      	String res = t.val + "(" + left + ")";
      	if(right.equals("")){
      		return res;
      	}
      	else{
      		res += "(" + right + ")";
      		return res;
      	}

    }
}