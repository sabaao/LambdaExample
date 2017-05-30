package lab.charles;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by charles on 2017/5/30.
 */
public class ListForEach {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        //lambda
        items.forEach(item-> System.out.println(item));


        items.forEach(item->{
            if("C".equals(item)){
                System.out.println(item);
            }
        });

        items.forEach(System.out::println);

        items.stream()
                .filter(s->s.contains("B"))
                .forEach(System.out::println);
    }
}
