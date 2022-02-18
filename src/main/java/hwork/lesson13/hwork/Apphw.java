package hwork.lesson13.hwork;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Apphw {
    public static void main(String[] args) {
        //create String ArrayList
        List<String> autoBrands = new ArrayList<>();

        //add method
        System.out.println("Elements added");
        autoBrands.add("Toyota");
        autoBrands.add("Nissan");
        autoBrands.add("Ford");
        autoBrands.add("Mazda");
        autoBrands.add("Chevrolet");
        autoBrands.add("Dodge");

        System.out.println(autoBrands+ "\n");

        //remove method
        int i = 2;
        String brandremoved = autoBrands.remove(i);
        System.out.println("Element #"+i+ " - " + brandremoved + " removed");

        System.out.println(autoBrands + "\n");

        //set method
        int arraysize = autoBrands.size();
        autoBrands.add("x");
        autoBrands.set(arraysize, brandremoved);

        System.out.println(brandremoved + " set as the last element");
        System.out.println(autoBrands + "\n");

        //foreach method to output all the String elements backwards
        autoBrands.forEach(Apphw::reverseSpelling);



        //get method
        List<String> backwordBrand = new ArrayList<>();
        for (int j = 0; j < autoBrands.size(); j++) {
            StringBuilder sb = new StringBuilder(autoBrands.get(j));
            backwordBrand.add(j, sb.reverse().toString());
        }
        System.out.println(backwordBrand + "\n");

        //create Integer ArrayList
        System.out.println("Created Integer Arraylist...");
        Integer[] value = {5, 4, 8, 109, 34, 15, 4, 123, -2101, 1, 0, 7, 3, 5, 1239};
        List<Integer> math = Arrays.asList(value);
//        ArrayList<Integer> math = new ArrayList<>();
//        math.add(1); //not working with Arrays.asList() method

        System.out.println(math + "\n");

        //set method for integer ArrayList
        System.out.println("Set method result for Integer");
        math.set(1, 3);


        //get() method for inteder
        System.out.println(math);
        int n = 6;
        System.out.println("Use get() method to get a value with index #" + n + " which is " + math.get(6) + "\n");

        System.out.println("foreach method for Integer");
        math.forEach(intVariable -> System.out.println("Array element is " + intVariable));


//        //remove method for integer
//        System.out.println("\nRemove method for Integer...");
//        math.remove(3); //not working with List<Integer> math = Arrays.asList(value);
//        System.out.println(math);

        //Double ArrayList

        List<Double> precision = new ArrayList<>();
        // Add() method for double
        System.out.println("\nAdd() method result for Double ArrayList");
        precision.add(6.3);
        precision.add(10.45);
        precision.add(123.5);
        precision.add(0.76);
        precision.add(3.44);
        precision.add(21.332);
        precision.add(57.86);
        precision.add(91.42);
        precision.add(6.1);
        System.out.println(precision);

        // Remove() method for double
        System.out.println("\nRemove() method result for Double ArrayList");
        double temp = precision.remove(5);
        System.out.println(precision);

        // Set() method for double
        System.out.println("\nSet() method result for Double ArrayList");
        precision.add(5, temp);
        System.out.println(precision + " - " + temp + " added back");
        precision.add(5, temp);
        System.out.println(precision);

        // Get() method for double
        System.out.println("\nGet() method result for Double ArrayList");
        int temp1 = 7;
        System.out.println("This is the " + temp1 + "th element in the ArrayList = " + precision.get(temp1));

        // Foreach() method for double
        System.out.println("\nGet() method result for Double ArrayList");
        precision.forEach(System.out::println);

        //Custom Arraylist class
        Vector t2er = new Vector(1, 2.6, 5.8, "t2er");

        List<Vector> spectrum = new ArrayList<>();

        //Add() method for the custom ArrayList
        spectrum.add(t2er);
        spectrum.add(new Vector(2, 5.7, 2.3, "t1te"));
        spectrum.add(new Vector(3, 5.1, 30.3, "t2te"));
        spectrum.add(new Vector(4, 7.5, 10.3, "t3te"));
        spectrum.add(new Vector(5, 3.7, 23.67, "t4te"));
        spectrum.add(new Vector(6, 5.4, 52.33, "t5tey"));

        //Foreach() method for the custom ArrayList
        spectrum.forEach(ca -> ca.printVectror(ca.getIndex(), ca.getValue(), ca.getAngle(), ca.getName()));

        //Remove() method for the custom ArrayList
        Vector temp2 = spectrum.remove(2);
        System.out.println("\nRemove() method result for Custom ArrayList");
        spectrum.forEach(ca -> ca.printVectror(ca.getIndex(), ca.getValue(), ca.getAngle(), ca.getName()));
        System.out.println("\nThis element was deleted: ");
        temp2.printVectror(temp2.getIndex(), temp2.getValue(), temp2.getAngle(), temp2.getName());

        //Set() method for the custom ArrayList
        System.out.println("\ndeleted vector put back");
        spectrum.add(2, temp2);
        spectrum.forEach(ca -> ca.printVectror(ca.getIndex(), ca.getValue(), ca.getAngle(), ca.getName()));
        spectrum.set(3, temp2);
        System.out.println("\nSet() method result for Custom ArrayList");
        spectrum.forEach(ca -> ca.printVectror(ca.getIndex(), ca.getValue(), ca.getAngle(), ca.getName()));
    }

    public static void reverseSpelling(String brand){
        StringBuilder sb = new StringBuilder(brand);
        System.out.println(sb.reverse().toString());
    }
    
}
