package pro.tompark.test.hackerrank.day30._08;

import java.util.*;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 * <p>
 * Day 8: Dictionaries and Maps
 * <p>
 * https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }

        List<String> resultList = new ArrayList<>();
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            Integer phone = phoneBook.get(s);
            if (phone == null) {
                resultList.add("Not found");
            } else {
                resultList.add(s + "=" + phone);
            }
        }

        for (String string : resultList) {
            System.out.println(string);
        }

        in.close();
    }
}
