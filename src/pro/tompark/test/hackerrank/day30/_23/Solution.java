package pro.tompark.test.hackerrank.day30._23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 * <p>
 * Day 23: BST Level-Order Traversal
 * <p>
 * https://www.hackerrank.com/challenges/30-binary-trees/problem
 */

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Solution {

    static void levelOrder(Node root) {
        //Write your code here
        if (root == null) {
            return;
        }

        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);

        String dataStr = "";
        while (!nodeQueue.isEmpty()) {
            // pick a Node from queue, if it not null then print data
            Node headNode = nodeQueue.poll();
            if (headNode != null) {
                if (dataStr.length() > 0) {
                    dataStr = dataStr + " " + String.valueOf(headNode.data);
                } else {
                    dataStr = String.valueOf(headNode.data);
                }

                // offer it's child nodes to queue
                nodeQueue.offer(headNode.left);
                nodeQueue.offer(headNode.right);
            }

            // loop this until there's no node in queue
        }

        System.out.println(dataStr);
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
