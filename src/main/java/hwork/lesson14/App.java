package hwork.lesson14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Blue");

        System.out.println(colors);

        colors.add("Red");

        System.out.println(colors);

        boolean xx = colors.contains("Green");
        System.out.println(xx);

//        for (String color : colors){
//            System.out.println(color);
//        }

        colors.forEach(System.out::println);

        List<String> colorsArray = new ArrayList<>(colors);

        System.out.println(colorsArray);

        colorsArray.add(2, "Red");

        System.out.println(colorsArray);



    }

}
