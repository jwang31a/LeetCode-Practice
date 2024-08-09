/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        
        //fast pointer and slow pointer
        ListNode fast = head;
        ListNode slow = head;

        //fast pointer goes ahead by two
        //slow one goes ahead by one, making sure it's always halfway in the LL
        //fast reaches end of LL first, so return slow which is in middle of LL
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}