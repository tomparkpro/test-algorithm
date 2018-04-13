package pro.tompark.test.hackerrank.day30._09;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 * <p>
 * Day 9: Recursion
 * <p>
 * https://www.hackerrank.com/challenges/30-recursion/problem
 */

import java.util.Scanner;

public class Solution {

    static int factorial(int n) {
        // Complete this function
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}

