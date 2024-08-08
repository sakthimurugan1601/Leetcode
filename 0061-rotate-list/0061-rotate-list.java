class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Edge cases: empty list or no rotation needed
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: Compute the length of the list and find the tail node
        ListNode oldTail = head;
        int length = 1;
        while (oldTail.next != null) {
            oldTail = oldTail.next;
            length++;
        }

        // Step 2: Find the effective rotation
        k = k % length;
        if (k == 0) {
            return head; // No rotation needed
        }

        // Step 3: Find the new tail and new head
        ListNode newTail = head;
        for (int i = 1; i < length - k; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;
        oldTail.next = head;

        return newHead;
    }
}
