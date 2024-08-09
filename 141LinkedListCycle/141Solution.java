/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //we need two pointers, one that goes fast and one that goes slow
        ListNode fast = head;
        ListNode slow = head;

        //while fast has a next value and fast's next node has a next value
        //we can loop with fast going forwards twice
        //and slow going forwards once
        //if there is no cycle, fast will reach the end of the linkedlist first
        //which means slow will not ever be the same as fast
        //but if there is a cycle, eventually, fast and slow will meet up and be the same
        while (fast != null && fast.next !=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}