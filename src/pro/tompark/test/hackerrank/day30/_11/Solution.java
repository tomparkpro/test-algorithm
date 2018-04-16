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
//        Scanner in = new Scanner(System.in);
//        int arr[][] = new int[6][6];
//        for(int i=0; i < 6; i++){
//            for(int j=0; j < 6; j++){
//                arr[i][j] = in.nextInt();
//            }
//        }

        int arr[][] = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        int hgWitdth = 3;           // width of hourglass
        int hgHeight = 3;           // height of hourglass
        int hgMiddle = 1;           // center from left top corner
        int width = arr[0].length;  // 2D array width
        int height = arr.length;    // 2D array height



        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
