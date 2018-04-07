package pro.tompark.test.hackerrank.day30._05;

import java.util.Scanner;

/**
 * Day 5: Loops
 *
 * https://www.hackerrank.com/challenges/30-loops/problem
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n >= 2 && n <= 20) {
            for (int i = 1; i < 11; i++) {
                System.out.println(n + " x " + i + " = " + n * i);
            }
        }

        in.close();
    }

}
