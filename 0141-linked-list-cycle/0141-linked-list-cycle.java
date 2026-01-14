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
        // set both pointers to head before traversing
        ListNode slow = head;
        ListNode fast = head;

        // checks if fast & fast's next is valid
        // to ensure that slow and fast can be compared 
        // before fast pointer hits end of LL
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
        }

        // hits here if hits end of LL without finding slow and fast being equal
        return false;
    }
}