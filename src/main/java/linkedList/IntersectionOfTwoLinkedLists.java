package linkedList;

/*
    Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
    If the two linked lists have no intersection at all, return null.

    The test cases are generated such that there are no cycles anywhere in the entire linked structure.

    Note that the linked lists must retain their original structure after the function returns.

    Custom Judge:
    The inputs to the judge are given as follows (your program is not given these inputs):
    intersectVal - The value of the node where the intersection occurs. This is 0 if there is no intersected node.
    listA - The first linked list.
    listB - The second linked list.
    skipA - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
    skipB - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.
    The judge will then create the linked structure based on these inputs and pass the two heads, headA and headB to your program.
    If you correctly return the intersected node, then your solution will be accepted.

    Constraints:
    The number of nodes of listA is in the m.
    The number of nodes of listB is in the n.
    1 <= m, n <= 3 * 10^4
    1 <= Node.val <= 10^5
    0 <= skipA <= m
    0 <= skipB <= n
    intersectVal is 0 if listA and listB do not intersect.
    intersectVal == listA[skipA] == listB[skipB] if listA and listB intersect.

    https://leetcode.com/problems/intersection-of-two-linked-lists/

    GFG article: https://www.geeksforgeeks.org/dsa/intersection-of-two-sorted-linked-lists/
 */

public class IntersectionOfTwoLinkedLists {
    // time - O(m+n), space - O(1)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //get sizes of both the lists.
        int listAsize = LinkedListUtils.size(headA);
        int listBsize = LinkedListUtils.size(headB);

        //travel the difference
        int diff = Math.abs(listAsize-listBsize);

        if(listAsize<listBsize) {
            ListNode tmp = headA;
            headA = headB;
            headB = tmp;
        }

        while(diff!=0) {
            headA = headA.next;
            diff--;
        }

        //travel together until the difference
        while(headA!=null && headB!=null) {
            if (headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

}
