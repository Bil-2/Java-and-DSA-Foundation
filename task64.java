public class task64 {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Solution to remove elements
    static class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode curr = dummy;

            while (curr.next != null) {
                if (curr.next.val == val) {
                    curr.next = curr.next.next; // skip node
                } else {
                    curr = curr.next;
                }
            }
            return dummy.next;
        }
    }

    // Helper to build linked list from array
    static ListNode buildList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int v : arr) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper to print linked list
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = buildList(arr);

        Solution sol = new Solution();
        head = sol.removeElements(head, 6);

        printList(head); // Output: 1 -> 2 -> 3 -> 4 -> 5 -> null
    }
}
