package lesson14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Pink");

        Iterator<String> iterator = colors.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
    }
}
