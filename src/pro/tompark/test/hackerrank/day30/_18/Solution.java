package pro.tompark.test.hackerrank.day30._18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 * <p>
 * Day 18: Queues and Stacks
 * <p>
 * https://www.hackerrank.com/challenges/30-queues-stacks/problem
 */
public class Solution {

    List<String> stack = new ArrayList<>();

    List<String> queue = new ArrayList<>();

    private void pushCharacter(char c) {
        stack.add(String.valueOf(c));
    }

    private char popCharacter() {
        String s = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return s.charAt(0);
    }

    private void enqueueCharacter(char c) {
        queue.add(String.valueOf(c));
    }

    private char dequeueCharacter() {
        String s = queue.get(0);
        queue.remove(0);
        return s.charAt(0);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

}
