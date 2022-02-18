package hwork.lesson14.hwork;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Apphw {
    public static void main(String[] args) {
        //<String, String> HAshMap
        Map<String, String> cars = new HashMap<>();

        //Put() method
        System.out.println("=================================== Put() method ===================================");
        cars.put("Toyota", "Prius");
        cars.put("Nissan", "Titan");
        cars.put("Mazda", "Bongo");
        cars.put("Chevrollet", "Calorado");
        cars.put("Ford", "F-150");
        System.out.println(cars + "\n");
        System.out.println("====================================================================================");

        //Remove() method
        System.out.println("================================== Remove() method =================================");
        cars.remove("Mazda");
        System.out.println(cars + "\n");
        System.out.println("====================================================================================");

        //Replace() method
        System.out.println("================================= Replace() method =================================");
        cars.replace("Toyota", "Tundra");
        System.out.println(cars + "\n");
        System.out.println("====================================================================================");


        //Get() method
        System.out.println("=================================== Get() method ===================================");
        String model = cars.get("Ford");
        System.out.println(model + "\n");
        System.out.println("====================================================================================");


        //Iterataion through the HashSet
        System.out.println("================= Example of Iteration through both KEYS and VALUES ================");
        for (Map.Entry <String, String> brandModelPair : cars.entrySet()){
            System.out.println(brandModelPair.getKey() + " = " + brandModelPair.getValue());
        }
        System.out.println("====================================================================================" + "\n");

        System.out.println("====================================================================================");
        System.out.println("=                     HashMap <Integer, String> results                            =");
        System.out.println("====================================================================================" + "\n");


        //<Integer, String> HashMap
        Map<Integer, String> listOfitems = new HashMap<>();


        //Put() method
        System.out.println("=================================== Put() method ===================================");
        listOfitems.put(1, "Apples");
        listOfitems.put(2, "Peaches");
        listOfitems.put(3, "Bananas");
        listOfitems.put(4, "Oranges");
        listOfitems.put(5, "Pears");
        listOfitems.put(6, "Plums");
        System.out.println(listOfitems);
        System.out.println("====================================================================================" + "\n");

        //Remove() method
        System.out.println("================================== Remove() method =================================");
        listOfitems.remove(3);
        System.out.println(listOfitems + "\n");
        System.out.println("====================================================================================");

        //Replace() method
        System.out.println("================================= Replace() method =================================");
        listOfitems.replace(4, "Apples_RED");
        System.out.println(listOfitems + "\n");
        System.out.println("====================================================================================");


        //Get() method
        System.out.println("=================================== Get() method ===================================");
        String fruit = listOfitems.get(1);
        System.out.println(fruit + "\n");
        System.out.println("====================================================================================");


        //Iterataion through the HashSet
        System.out.println("================= Example of Iteration through both KEYS and VALUES ================");
        for (Map.Entry <Integer, String> fruitList : listOfitems.entrySet()){
            System.out.println(fruitList.getKey() + " = " + fruitList.getValue());
        }
        System.out.println("====================================================================================" + "\n");

        System.out.println("====================================================================================");
        System.out.println("=                HashMap <Class1, Class2> results //Custom class                   =");
        System.out.println("====================================================================================" + "\n");


        //<Integer, String> HashMap
        Map<Company, Employee> listOfCompanies = new HashMap<>();


        //Put() method
        System.out.println("=================================== Put() method ===================================");
        Company roga = new Company("Roga", 101);
        Employee alexander = new Employee("Alexander", 34.56);
        listOfCompanies.put(roga, alexander);
        Company kopyta = new Company("Kopyta", 45);
        Employee brain = new Employee("Brain", 30.56);
        listOfCompanies.put(roga, alexander);
        Company apple = new Company("Apple", 10000);
        Employee alex = new Employee("Alex", 50.43);
        listOfCompanies.put(roga, alexander);
        Company samsung = new Company("Samsung", 12000);
        Employee john = new Employee("John", 45.32);
        listOfCompanies.put(roga, alexander);
        listOfCompanies.put(kopyta, brain);
        listOfCompanies.put(apple, alex);
        listOfCompanies.put(samsung, john);


        for (Map.Entry<Company, Employee> ce : listOfCompanies.entrySet()){
            System.out.println(ce.getKey().getCompanyInfo() + ": " + ce.getValue().getEmploeeInfo());
        }
        System.out.println("====================================================================================" + "\n");


        //Replace() method
        System.out.println("================================== Replace() method =================================");

        listOfCompanies.replace(roga, new Employee("Wiliam", 45.2));
        for (Map.Entry<Company, Employee> ce : listOfCompanies.entrySet()){
            System.out.println(ce.getKey().getCompanyInfo() + ": " + ce.getValue().getEmploeeInfo());
        }
        System.out.println("====================================================================================" + "\n");

        //Remove() method
        System.out.println("================================== Remove() method =================================");
        listOfCompanies.remove(apple);
        for (Map.Entry<Company, Employee> ce : listOfCompanies.entrySet()){
            System.out.println(ce.getKey().getCompanyInfo() + ": " + ce.getValue().getEmploeeInfo());
        }
        System.out.println("====================================================================================" + "\n");

        //Get() method
        System.out.println("=================================== Get() method ===================================");
        System.out.println(listOfCompanies.get(samsung).getEmploeeInfo());
        System.out.println(listOfCompanies.get(kopyta).getName() + " with the salary: " + listOfCompanies.get(kopyta).getSalary());
        System.out.println("====================================================================================");
    }

}
