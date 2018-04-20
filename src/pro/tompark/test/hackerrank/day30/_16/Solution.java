package pro.tompark.test.hackerrank.day30._16;

import java.util.Scanner;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 *
 * Day 16: Exceptions - String to Integer
 *
 * https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        String result;
        try {
            Integer.parseInt(S);
            result = S;
        } catch (NumberFormatException e) {
            result = "Bad String";
        }

        System.out.println(result);
    }
}
