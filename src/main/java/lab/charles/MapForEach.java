package lab.charles;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by charles on 2017/5/30.
 */
public class MapForEach {
    public static void main(String[] args) {
        Map<String,Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));

        items.forEach((k,v)->{
            System.out.println("item : " + k + " Count :" + v);
            if("E".equals(k)){
                System.out.println("Hello E");
            }
        });
    }
}
