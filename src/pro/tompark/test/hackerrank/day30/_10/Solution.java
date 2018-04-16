package pro.tompark.test.hackerrank.day30._10;

import java.util.Scanner;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 * <p>
 * Day 10: Binary Numbers
 * <p>
 * https://www.hackerrank.com/challenges/30-binary-numbers/problem
 */
public class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 1 && n <= 1000000) {
            String binaryString = Integer.toBinaryString(n);
//            System.err.println(binaryString);
            char[] binaryArray = binaryString.toCharArray();
            int maxConsecutiveOfOne = 0;
            int consecutive = 0;
            for (char bit : binaryArray) {
//                System.err.println(bit);
                if (bit == '1') {
                    consecutive++;
                } else if (bit == '0') {
                    consecutive = 0;
                }

                if (consecutive > maxConsecutiveOfOne) {
                    maxConsecutiveOfOne = consecutive;
//                    System.err.println(consecutive);
                }
            }

            System.out.println(maxConsecutiveOfOne);
        }
    }
}
