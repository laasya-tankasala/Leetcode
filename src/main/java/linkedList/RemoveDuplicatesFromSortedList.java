package linkedList;

/*
    Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
    Return the linked list sorted as well.

    Constraints:
    The number of nodes in the list is in the range [0, 300].
    -100 <= Node.val <= 100
    The list is guaranteed to be sorted in ascending order.

    https://leetcode.com/problems/remove-duplicates-from-sorted-list/

    GFG article: https://www.geeksforgeeks.org/dsa/remove-duplicates-from-a-sorted-linked-list/
 */

public class RemoveDuplicatesFromSortedList {

    // time - O(n), space - O(1)
    public ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;

        while(curr!=null && curr.next!=null){
            if(curr.val != curr.next.val) {
                curr = curr.next;
            } else
                curr.next = curr.next.next;
        }

        return head;

    }
}
