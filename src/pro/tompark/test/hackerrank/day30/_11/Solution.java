package pro.tompark.test.hackerrank.day30._11;

import java.util.Scanner;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 * <p>
 * Day 11: 2D Arrays
 * <p>
 * https://www.hackerrank.com/challenges/30-2d-arrays/problem
 */
public class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

//        int arr[][] = {
//                {1, 1, 1, 0, 0, 0},
//                {0, 1, 0, 0, 0, 0},
//                {1, 1, 1, 0, 0, 0},
//                {0, 0, 2, 4, 4, 0},
//                {0, 0, 0, 2, 0, 0},
//                {0, 0, 1, 2, 4, 0}
//        };
//        int arr[][] = {
//                {-1, -1, 0, -9, -2, -2},
//                {-2, -1, -6, -8, -2, -5},
//                {-1, -1, -1, -2, -3, -4},
//                {-1, -9, -2, -4, -4, -5},
//                {-7, -3, -3, -2, -9, -9},
//                {-1, -3, -1, -2, -4, -5}
//        };



//        for(int i=0; i < 6; i++){
//            for(int j=0; j < 6; j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }

        int hgWitdth = 3;           // width of hourglass
        int hgHeight = 3;           // height of hourglass
        int width = arr[0].length;  // 2D array width
        int height = arr.length;    // 2D array height

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= (height - hgHeight); i++) {
            for (int j = 0; j <= (width - hgWitdth); j++) {
                int top = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                int neck = arr[i+1][j+1];
                int bottom = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                int sum = top + neck + bottom;
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);
    }
}
