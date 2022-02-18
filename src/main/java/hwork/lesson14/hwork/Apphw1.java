package hwork.lesson14.hwork;

import java.util.*;

public class Apphw1 {
    public static void main(String[] args) {
        //Creating HashSets
        Set<String> devices = new HashSet<>();

        //Add() method
        System.out.println("=================================== Add() method ===================================");
        devices.add("iPhone");
        devices.add("Macbook_Pro");
        devices.add("Macbook_Air");
        devices.add("iPad");
        System.out.println(devices);
        System.out.println("====================================================================================" + "\n");

        //Remove() methode
        System.out.println("================================== Remove() method =================================");
        devices.remove("Macbook_Air");
        System.out.println(devices + "\n");
        System.out.println("====================================================================================");

        //Add back the item removed
        devices.add("iMac");

        //Contains() method
        System.out.println("================================= Contains() method =================================");
        Scanner console = new Scanner(System.in);

//        System.out.print("Enter the device name: ");
//        String checkName = console.next();

        String checkName = "iPad"; //temp debuging code

        if (devices.contains(checkName)){
            System.out.println("The " + checkName + " is EXISTING in the HashSet");
        } else {
            System.out.println("The " + checkName + " is NOT EXISTING in the HashSet");
        }
        System.out.println("====================================================================================" + "\n");

        //Creating Custom Class HashSet
        System.out.println("====================================================================================");
        System.out.println("=                       HashSet <Custom Class> results                             =");
        System.out.println("====================================================================================" + "\n");

        Set<Teacher> university = new HashSet<>();

        //Creating Teacher objects
        Teacher cris = new Teacher("Alexander McMillan", "Math", 420);
        Teacher john = new Teacher("John Watson", "Medicine", 1090);
        Teacher alex = new Teacher("Alex Bernard", "English", 230);
        Teacher milton = new Teacher("Milton Heshel", "Russian", 300);

        System.out.println("=================================== Add() method ===================================");
        university.add(cris);
        university.add(john);
        university.add(alex);
        university.add(milton);
        System.out.println("====================================================================================" + "\n");

        //Remove() methode
        System.out.println("================================== Remove() method =================================");
        Teacher temp = alex;// put the teacher name you want to remove
        university.remove(temp);
        System.out.println("Teacher " + temp.getName() + " has been taken off the list");
        System.out.println("====================================================================================");

        System.out.println("================================= Contains() method =================================");

        Teacher checkTeacher = alex; //temp debuging code

        if (university.contains(checkTeacher)){
            System.out.println("The " + checkTeacher.getName() + " is EXISTING in the HashSet");
        } else {
            System.out.println("The " + checkTeacher.getName() + " is NOT EXISTING in the HashSet");
        }
        System.out.println("====================================================================================" + "\n");
    }
}
