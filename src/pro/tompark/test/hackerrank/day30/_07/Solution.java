package pro.tompark.test.hackerrank.day30._07;

import java.util.Scanner;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 * <p>
 * Day 7: Arrays
 * <p>
 * https://www.hackerrank.com/challenges/30-arrays/problem
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        if (n >= 1 && n <= 1000) {
            int[] arr = new int[n];
            String str = in.nextLine();
            String[] strArr = str.split(" ");
            for (int i = 0; i < strArr.length; i++) {
                int value = Integer.valueOf(strArr[i]);
                if (value >= 1 && value <= 10000) {
                    arr[i] = value;
                }
            }

            String result = "";
            for (int i = n - 1; i >= 0; i--) {
                result = result + arr[i];
                if (i != 0) {
                    result = result + " ";
                }
            }

            System.out.println(result);
        }

        in.close();
    }
}