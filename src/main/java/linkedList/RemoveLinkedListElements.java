package linkedList;

/*
    Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val,
    and return the new head.

    Constraints:
    The number of nodes in the list is in the range [0, 10^4].
    1 <= Node.val <= 50
    0 <= val <= 50

    https://leetcode.com/problems/remove-linked-list-elements/

    GFG article: https://www.geeksforgeeks.org/dsa/delete-occurrences-given-key-linked-list/
 */
public class RemoveLinkedListElements {

    // O(n) time and O(1) space.
    // alternatively, try with recursion.
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;

        ListNode curr = head;

        while(curr!=null && curr.next!=null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else
                curr = curr.next;
        }

        if(head.val == val)
            return head.next;

        return head;
    }
}
