package pro.tompark.test.hackerrank.day30._22;

import java.util.Scanner;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 * <p>
 * Day 22: Binary Search Trees
 * <p>
 * https://www.hackerrank.com/challenges/30-binary-search-trees/problem
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

    public static int getHeight(Node root) {
        //Write your code here
        int height = 0;
        if (root == null) {
            return height;
        }

        if (root.left != null || root.right != null) {
            height = 1;
        }

        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if (left >= right) {
            height = height + left;
        } else {
            height = height + right;
        }

        return height;
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
        int height = getHeight(root);
        System.out.println(height);
    }
}
