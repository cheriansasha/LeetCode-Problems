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
    public ListNode deleteDuplicates(ListNode head) {

        //U-understand
        //given head of sorted LL singly linked
        //possible >1 duplicate at a time
        //can head == null

        //M-match: LL

        //P-plan
        //make current where always checking for duplicate in next
        //if duplicate, make next equal to next next and keep checking if that node
        //is duplicate or not
        //if not duplicate, keep iterating
        //keeping going until next is null

        //I-implement
        ListNode current = head;

        while(current != null && current.next != null) {
            if(current.val == current.next.val) {
                current.next = current.next.next;
            }
            //check if the next next is also a duplicate, only if not, then change 
            //current
            else {
                current = current.next;
            }
        }
        return head;
    }
}