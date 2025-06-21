package linkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesFromSortedListTest {

    RemoveDuplicatesFromSortedList obj;

    @BeforeEach
    void setup() {
        obj = new RemoveDuplicatesFromSortedList();
    }

    @Test
    void testEmptyLinkedList() {
        assertNull(obj.deleteDuplicates(null));
    }

    @Test
    void testSingleElementLinkedList() {
        ListNode head = new ListNode(3);
        ListNode expected = new ListNode(3);
        assertTrue(LinkedListUtils.equals(expected, obj.deleteDuplicates(head)));
    }

    @Test
    void testNoDuplicatesList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);

        assertTrue(LinkedListUtils.equals(expected, obj.deleteDuplicates(head)));
    }

    @Test
    void testDuplicatesList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);

        assertTrue(LinkedListUtils.equals(expected, obj.deleteDuplicates(head)));

    }
}
