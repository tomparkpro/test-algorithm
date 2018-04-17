package pro.tompark.test.hackerrank.day30._12;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 * <p>
 * Day 12: Inheritance
 * <p>
 * https://www.hackerrank.com/challenges/30-inheritance/problem
 */
public class Student extends Person {
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public String calculate() {
        String grade = "T";

        if (testScores != null && testScores.length > 0) {
            int sum = 0;
            for (int score : testScores) {
                sum += score;
            }

            long average = sum / testScores.length;

            if (average >= 90) {
                grade = "O";
            } else if (average >= 80) {
                grade = "E";
            } else if (average >= 70) {
                grade = "A";
            } else if (average >= 50) {
                grade = "P";
            } else if (average >= 40) {
                grade = "D";
            }
        }

        return grade;
    }
}
