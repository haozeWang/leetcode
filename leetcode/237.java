public class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode pre = new ListNode(0);
        while(node.next != null){
        	pre = node;
        	node.val = node.next.val;
        	node = node.next;

        }
        pre.next = null;

    }
}