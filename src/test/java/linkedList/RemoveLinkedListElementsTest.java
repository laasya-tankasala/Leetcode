package linkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemoveLinkedListElementsTest {

    private RemoveLinkedListElements object;
    private ListNode head;
    private int val;

    @Test
    void testNull() {
        val = 1;
        object = new RemoveLinkedListElements();

        assertNull(object.removeElements(null, val));
    }

    @Test
    void testAllValElements() {
        val = 1;
        object = new RemoveLinkedListElements();

        head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(1);

        assertNull(object.removeElements(head, val));
    }

    @Nested
    public class NestedTestBlock {
        @BeforeEach
        void setup () {
            object = new RemoveLinkedListElements();

            head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(3);
            head.next.next.next.next = new ListNode(2);
            head.next.next.next.next.next = new ListNode(4);
        }

        @Test
        void generalCase () {
            val = 2;

            ListNode expected = new ListNode(1);
            expected.next = new ListNode(3);
            expected.next.next = new ListNode(3);
            expected.next.next.next = new ListNode(4);

            ListNode result = object.removeElements(head, val);

            assertTrue(LinkedListUtils.equals(expected, result));
        }

        @Test
        void valAtHead () {
            val = 1;

            ListNode expected = new ListNode(2);
            expected.next = new ListNode(3);
            expected.next.next = new ListNode(3);
            expected.next.next.next = new ListNode(2);
            expected.next.next.next.next = new ListNode(4);

            ListNode result = object.removeElements(head, val);

            assertTrue(LinkedListUtils.equals(expected, result));
        }

        @Test
        void valAtTail () {
            val = 4;

            ListNode expected = new ListNode(1);
            expected.next = new ListNode(2);
            expected.next.next = new ListNode(3);
            expected.next.next.next = new ListNode(3);
            expected.next.next.next.next = new ListNode(2);

            ListNode result = object.removeElements(head, val);

            assertTrue(LinkedListUtils.equals(expected, result));
        }

        @Test
        void valInConsecutiveNodes () {
            val = 3;

            ListNode expected = new ListNode(1);
            expected.next = new ListNode(2);
            expected.next.next = new ListNode(2);
            expected.next.next.next = new ListNode(4);

            ListNode result = object.removeElements(head, val);

            assertTrue(LinkedListUtils.equals(expected, result));
        }
    }


}
