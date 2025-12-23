# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        """
        :type list1: Optional[ListNode]
        :type list2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """

        # make a dummy node that equals a tail pointer and set the dummy node value to 0
        dummyNode = tail = ListNode()

        # while list1 and list2 is not empty
        while list1 and list2:

            # compare list1 and list2 value and take smaller node
            if list1.val < list2.val:
                tail.next = list1
                list1 = list1.next

            else:
                tail.next = list2
                list2 = list2.next

            # set the tail's pointer to the smaller node
            tail = tail.next

        # if list1 or list2 still has values, point to tail
        if list1:
            tail.next = list1
        else:
            tail.next = list2

        return dummyNode.next        