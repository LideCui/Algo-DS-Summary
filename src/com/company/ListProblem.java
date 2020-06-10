package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListProblem {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * Given a singly linked list, group all odd nodes together followed by the even nodes.
     * Please note here we are talking about the node number and not the value in the nodes.
     * @param head
     * @return
     */
    public ListNode oddEvenList(ListNode head) {

    }

    /**
     * Given two lists of closed intervals, each list of intervals is pairwise disjoint and in sorted order.
     *
     * Return the intersection of these two interval lists.
     *
     * (Formally, a closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.
     * The intersection of two closed intervals is a set of real numbers that is either empty,
     * or can be represented as a closed interval.  For example, the intersection of [1, 3] and [2, 4] is [2, 3].)
     * @param A
     * @param B
     * @return
     */
    public static int[][] intervalIntersection(int[][] A, int[][] B) {

    }

    /**
     * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
     * @param node
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    /**
     * Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k),
     * where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h.
     * Write an algorithm to reconstruct the queue.
     * @param people
     * @return
     */
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0]!=b[0]?b[0]-a[0]:a[1]-b[1];
            }
        });

        ArrayList<int[]> ls = new ArrayList<>();
        for(int i=0;i<people.length;i++){
            ls.add(people[i][1],people[i]);
        }

        return ls.toArray(new int[ls.size()][2]);
    }


}
