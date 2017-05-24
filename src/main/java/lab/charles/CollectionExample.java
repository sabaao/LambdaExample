package lab.charles;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by charles on 2017/5/24.
 */
public class CollectionExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, new Comparator<String>() {

            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        System.out.println(names);

        // use lambda

        names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names,(String a, String b) -> b.compareTo(a));
        System.out.println(names);
    }
}
