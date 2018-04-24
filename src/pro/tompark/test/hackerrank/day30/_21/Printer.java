package pro.tompark.test.hackerrank.day30._21;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 * <p>
 * Day 21: Generics
 * <p>
 * https://www.hackerrank.com/challenges/30-generics/problem
 */
public class Printer<T> {

    /**
     * Method Name: printArray
     * Print each element of the generic array on a new line. Do not return anything.
     *
     * @param A generic array
     **/
    // Write your code here
    public void printArray(T[] A) {
        for (T value : A) {
            System.out.println(value);
//            if (value instanceof Integer) {
//                System.out.println(value);
//            } else if (value instanceof String) {
//                System.out.println(value);
//            }
        }
    }
}
