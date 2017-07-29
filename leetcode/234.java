public class Solution {
    public boolean isPalindrome(ListNode head) {
    	if(head == null) return true;
        ListNode temp = head;
        ListNode mid = findMid(temp);
        mid = reverse(mid);
        while (head != null) {
        	if(head.val != mid.val) return false;
        	head = head.next;
        	mid = mid.next;
        }
        return true;
    }



    public ListNode findMid(ListNode head){
    	ListNode slow = head;
    	ListNode fast = head;
    	ListNode pre= head;
    	while (fast!= null && fast.next != null) {
    		pre = slow;
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	pre.next = null;
    	return slow;
    }


    public ListNode reverse(ListNode head){
    	ListNode dummy = new ListNode(0);
    	while (head != null) {
    		ListNode temp = head.next;
    		head.next = dummy.next;
    		dummy.next = head;
    		head = temp;
    	}
    	return dummy.next;
    }


}