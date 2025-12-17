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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode();
        ListNode tail = dummyNode;

        while(list1 != null && list2 != null) {

            //append list1's head to the list by pointing tail's next pointer 
            //to list1's head
            if(list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            }

            //do the same if list2 is smaller than list1
            else {
                tail.next = list2;
                list2 = list2.next;
            }

            //move tail pointer forward one node
            tail = tail.next;
        }

        //append the rest of either lists if nodes left
        if(list1 != null) {
            tail.next = list1;
        }
        else {
            tail.next = list2;
        }

        //returns the head of the resulting list
        return dummyNode.next;
    }
}