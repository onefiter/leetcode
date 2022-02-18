package com.LinkedList;

/**
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */
public class _24_Swap_Nodes_in_Pairs {
    /**
     * 递归
     *
     * @param head
     * @return
     */
    public static ListNode swapPairsV1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;
        head.next = swapPairsV1(newHead.next);
        newHead.next = head;
        return newHead;
    }

    /**
     * 迭代
     *
     * @param head
     * @return
     */

    public static ListNode swapPairsV2(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while (temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }


    public static void main(String[] args) {
        ListNode node1 = (new ListNode()).generateNodeList();

        ListNode newHead = swapPairsV2(node1);

        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }
}
