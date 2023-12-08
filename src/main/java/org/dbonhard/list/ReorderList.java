package org.dbonhard.list;

import java.util.Deque;
import java.util.LinkedList;

public class ReorderList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void solution(ListNode head) {
        Deque<ListNode> deque = new LinkedList<>();
        ListNode root = head.next;
        while (root != null) {
            deque.add(root);
            root = root.next;
        }

        root = head;
        while (!deque.isEmpty()) {
            root.next = deque.pollLast();
            root.next.next = deque.pollFirst();
            if (root.next.next != null) {
                root.next.next.next = null;
            }
            root = root.next.next;
        }
    }
}
