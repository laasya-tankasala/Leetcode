package linkedList;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mockStatic;

public class IntersectionOfTwoLinkedListsTest {

    private final IntersectionOfTwoLinkedLists solution = new IntersectionOfTwoLinkedLists();

    @Test
    public void testIntersectionAtNode() {
        // Common part
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        // List A: 3 -> 7 -> 4 -> 8 -> 10
        ListNode headA = new ListNode(3);
        headA.next = new ListNode(7);
        headA.next.next = new ListNode(4);
        headA.next.next.next = common;

        // List B: 99 -> 1 -> 8 -> 10
        ListNode headB = new ListNode(99);
        headB.next = new ListNode(1);
        headB.next.next = common;

        try (MockedStatic<LinkedListUtils> mocked = mockStatic(LinkedListUtils.class)) {
            // Mock the size method
            mocked.when(() -> LinkedListUtils.size(headA)).thenReturn(5);
            mocked.when(() -> LinkedListUtils.size(headB)).thenReturn(4);

            ListNode result = solution.getIntersectionNode(headA, headB);
            assertEquals(common, result);
        }
    }

    @Test
    public void testNoIntersection() {
        // List A: 1 -> 2 -> 3
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);

        // List B: 4 -> 5
        ListNode headB = new ListNode(4);
        headB.next = new ListNode(5);

        ListNode result = solution.getIntersectionNode(headA, headB);
        assertNull(result);
    }

    @Test
    public void testIntersectionAtHead() {
        // Shared List: 1 -> 2 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        // Both lists are the same
        ListNode result = solution.getIntersectionNode(head, head);
        assertEquals(head, result);
    }

    @Test
    public void testOneListIsNull() {
        ListNode headA = null;

        // List B: 1 -> 2
        ListNode headB = new ListNode(1);
        headB.next = new ListNode(2);

        ListNode result = solution.getIntersectionNode(headA, headB);
        assertNull(result);
    }

    @Test
    public void testBothListsNull() {
        ListNode result = solution.getIntersectionNode(null, null);
        assertNull(result);
    }

    @Test
    public void testSimilarSegmentsAsTheCommon() {
        // Common part
        ListNode common = new ListNode(2);
        common.next = new ListNode(3);
        common.next.next = new ListNode(4);

        // List A: 1 -> 2 -> 3 -> 2 -> 3 -> 4
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = common;

        // List B: 4 -> 5 -> 2 -> 3 -> 4
        ListNode headB = new ListNode(4);
        headB.next = new ListNode(5);
        headB.next.next = common;

        ListNode result = solution.getIntersectionNode(headA, headB);
        assertEquals(common, result);
        assertNotEquals(headA.next, result);
    }
}