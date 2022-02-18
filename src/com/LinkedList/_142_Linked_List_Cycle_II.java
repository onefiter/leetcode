package com.LinkedList;


import java.util.HashSet;
import java.util.Set;

public class _142_Linked_List_Cycle_II {

    /**
     * HashSet
     *
     * @param head
     * @return
     */
    public static ListNode detectCycleV1(ListNode head) {
        ListNode pos = head;
        Set<ListNode> set = new HashSet<ListNode>();
        while (pos != null) {
            if (set.contains(pos)) {
                return pos;
            } else {
                set.add(pos);
            }
            pos = pos.next;
        }
        return null;
    }

    /**
     * 快慢指针
     *
     * @param head
     * @return
     */
    public static ListNode detectCycleV2(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println(detectCycleV2(node1).val);
    }
}
