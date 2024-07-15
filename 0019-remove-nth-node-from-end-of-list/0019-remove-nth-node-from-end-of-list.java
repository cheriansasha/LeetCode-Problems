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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //U-understand

        //M-match: singly LL

        //P-plan
        //use a pointer to calculate size of LL
        //use current pointer to count to size - (n - 1) node
        //make current.next = current.next.next
        //return head

        //I-implement
        ListNode szPointer = head;
        int sz = 1;
        ListNode current = head;
        
        //counts number of nodes in LL
        while(szPointer != null && szPointer.next != null) {
            sz++;
            szPointer = szPointer.next;
        }

        //removing beginning node
        if(sz - n == 0) {
            return head = head.next;
        }

        //reach desired node prior to nth node needed to be removed
        for(int i = 1; i < sz-n; i++) {
            current = current.next;
        }
        //remove end node
        if(current.next == null) {
            return null;
        }
        //remove middle node
        else {
            current.next = current.next.next;
            return head;
        }
    }
}