package pro.tompark.test.hackerrank.day30._17;

import java.util.Scanner;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 * <p>
 * Day 17: More Exceptions
 * <p>
 * https://www.hackerrank.com/challenges/30-more-exceptions/problem
 */
class Calculator {
    public int power(int n, int p) {
        if (n < 0 || p < 0) {
            throw new RuntimeException("n and p should be non-negative");
        }

        int result = 1;
        for (int i = 0; i < p; i++) {
            result = result * n;
        }

        return result;
    }
}

class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
