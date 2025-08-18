import java.util.PriorityQueue;

public class task46{
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
        public ListNode mergeKLists(ListNode[] lists) {
            // Min-heap based on node value
            PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

            // Push the head of each non-empty list
            for (ListNode head : lists) {
                if (head != null) pq.add(head);
            }

            // Dummy node to build result
            ListNode dummy = new ListNode(0);
            ListNode curr = dummy;

            // Process heap
            while (!pq.isEmpty()) {
                ListNode node = pq.poll(); // Get smallest
                curr.next = node;
                curr = curr.next;

                if (node.next != null) pq.add(node.next); // Push next node of same list
            }

            return dummy.next;
        }
    }

    // ✅ Main method for testing
    public static void main(String[] args) {
        // Create test lists: [1->4->5], [1->3->4], [2->6]
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));

        ListNode[] lists = {l1, l2, l3};

        Solution sol = new Solution();
        ListNode merged = sol.mergeKLists(lists);

        // Print result
        System.out.print("Merged List: ");
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
        System.out.println();
    }
}
