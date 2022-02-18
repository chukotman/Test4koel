package lesson13;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println(colors);
        System.out.println(colors.size());

        colors.add("Green");
        colors.add("Pink");
        colors.add("Blue");
        System.out.println(colors);
        System.out.println(colors.size());

        colors.add(1,"Grey");
        System.out.println(colors);

        String color = colors.remove(3);
        System.out.println(color);
        System.out.println(colors);

        System.out.println(colors.get(0));
        color = colors.set(1,"Violet");
        System.out.println(color);
        System.out.println(colors);

        colors.remove("Blue");
        System.out.println(colors);

//        for (int i=0; i<colors.size();i++){
//            System.out.println(colors.get(i));
//        }
//        for (String col : colors){
//            System.out.println(col);
//        }
        colors.forEach(col-> System.out.println(col));
        colors.forEach(System.out::println);



    }
}
