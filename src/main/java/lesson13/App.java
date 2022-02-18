package lesson13;

public class App {
    public static void main(String[] args) {
        int x = 5;
        int z = x;
        x=10;
        System.out.println("z="+z);

        Person x1 = new Person("XXXX");
        Person z1 = x1;
        x1.setName("ZZZZZ");
        System.out.println("z1="+z1.getName());

        int[]arr1 = {1,2,3};
        int[]arr2 = arr1;
        arr1[0]=99;
        System.out.println(arr2[0]);






    }
}
