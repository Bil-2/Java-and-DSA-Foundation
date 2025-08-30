import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
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

public class task61 {
    // Helper to build list from array
    static ListNode buildList(int[] arr) {
        ListNode dummy = new ListNode(0), curr = dummy;
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
        ListNode[] lists = new ListNode[3];
        lists[0] = buildList(new int[]{1,4,5});
        lists[1] = buildList(new int[]{1,3,4});
        lists[2] = buildList(new int[]{2,6});

        Solution sol = new Solution();
        ListNode merged = sol.mergeKLists(lists);

        printList(merged); // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6 -> null
    }
}
