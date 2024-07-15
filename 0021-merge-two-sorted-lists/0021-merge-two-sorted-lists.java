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
        //edge cases
        if(list1 == null && list2 == null) {
            return null;
        }
        else if(list1 == null) {
            return list2;
        }
        else if(list2 == null) {
            return list1;
        }

        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode result = new ListNode();
        ListNode currResult;

        //find result head
        if(curr1.val <= curr2.val) {
            result = curr1;
            currResult = curr1;
            curr1 = curr1.next;
        }
        else{
            result = curr2;
            currResult = curr2;
            curr2 = curr2.next;
        }

        //find rest of result LL
        while(curr1 != null && curr2 != null) {
            if(curr1.val <= curr2.val) {
                currResult.next = curr1;
                curr1 = curr1.next;
            }
            else  {
                currResult.next = curr2;
                curr2 = curr2.next;
            }
            currResult = currResult.next;
        }

        while(curr1 != null) {
            currResult.next = curr1;
            curr1 = curr1.next;
            currResult = currResult.next;
        }
        while(curr2 != null) {
            currResult.next = curr2;
            curr2 = curr2.next;
            currResult = currResult.next;
        }

        return result;
    }
}