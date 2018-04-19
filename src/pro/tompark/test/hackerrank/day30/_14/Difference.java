package pro.tompark.test.hackerrank.day30._14;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 */
public class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        for (int i = 0; i < elements.length -1; i++) {
            for (int j = i+1; j < elements.length; j++) {
                int first = elements[i];
                if (first < 0) {
                    first = first * -1;
                }

                int second = elements[j];
                if (second < 0) {
                    second = second * -1;
                }

                int difference = 0;
                if (first >= second) {
                    difference = first - second;
                } else {
                    difference = second - first;
                }

                if (difference >= maximumDifference) {
                    maximumDifference = difference;
                }
            }
        }
    }
    
} // End of Difference class
