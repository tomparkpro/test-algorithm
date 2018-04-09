package pro.tompark.test.hackerrank.day30._06;

import java.util.Scanner;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 * <p>
 * Day 6: Let's Review
 * <p>
 * https://www.hackerrank.com/challenges/30-review-loop/problem
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n >= 1 && n <= 10) {
            for (int i = 0; i < n; i++) {
                String string = in.next();
                int length = string.length();
                if (length >= 2 && length <= 10000) {
                    char[] strArr = string.toCharArray();
                    String oddString = "";
                    String evenString = "";
                    for (int j = 0; j < strArr.length; j++) {
                        if (j == 0 || j % 2 == 0) {
                            evenString = evenString + strArr[j];
                        } else {
                            oddString = oddString + strArr[j];
                        }
                    }

                    System.out.println(evenString + " " + oddString);
                }
            }
        }
        in.close();
    }
}
