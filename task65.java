public class task65 {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Solution class
    static class Solution {
        public ListNode deleteMiddle(ListNode head) {
            if (head == null || head.next == null) return null;

            ListNode slow = head, fast = head;
            ListNode prev = null;

            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }

            // Remove middle node
            prev.next = slow.next;
            return head;
        }
    }

    // Helper to build list from array
    static ListNode buildList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int v : arr) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper to print list
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = buildList(arr);

        Solution sol = new Solution();
        head = sol.deleteMiddle(head);

        printList(head); // Expected: 1 -> 2 -> 4 -> 5 -> null
    }
}
