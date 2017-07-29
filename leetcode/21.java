public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        while (node2 != null || node1 != null) {
        	int num1 = node1==null?Integer.MAX_VALUE:node1.val;
        	int num2 = node2==null?Integer.MAX_VALUE:node2.val;
        	if(num1 < num2) {
        		dummy.next = node1;
        		dummy = dummy.next;
        		node1 = node1.next;
        	}
        	else{
        		dummy.next = node2;
        		dummy = dummy.next;
        		node2 = node2.next;
        	}
        }
        return res.next;

    }
}