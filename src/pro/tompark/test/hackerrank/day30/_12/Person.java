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
public class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    public Person() {
    }

    // Constructor
    public Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }
}
