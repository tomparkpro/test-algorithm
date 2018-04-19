package pro.tompark.test.hackerrank.day30._15;

import java.util.Scanner;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 * <p>
 * Day 15: Linked List
 * <p>
 * https://www.hackerrank.com/challenges/30-linked-list/problem
 */
public class Solution {

    public static Node insert(Node head, int data) {
        //Complete this method
        if (head == null) {
            head = new Node(data);
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }

            lastNode.next = new Node(data);
        }

        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}
