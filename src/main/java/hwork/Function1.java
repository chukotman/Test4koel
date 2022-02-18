package hwork;

public class Function1 {
    //    public static void checkAge(int Age){
//        if (Age < 21){
//            System.out.println("No Alchohol");
//        } else{
//            System.out.println("Get your Beer!");
//        }
    public static void Sum(int arg1, int arg2){
        System.out.println(arg1+ "+" +arg2+ "=" +(arg1 + arg2));
    }

    public static int Sum2(int ArgR1, int ArgR2){
        return ArgR1 + ArgR2;
    }

    public static boolean isEven(int ArgM){

        return ArgM % 2 == 0;
    }

    public static void main(String[] args) {
//        checkAge(35);
        //print out sum of 2 arguments by void function
        System.out.println("Homework to lesson 5");

        System.out.println("Exercise #1");
        Sum(6, 14);
        Sum(12, 25);
        Sum(134, 16);
        System.out.println();


        //Print out Sum of 2 arguments by returning int value
        System.out.println("Exercise #2");
        int total = Sum2(34, 56);
        System.out.println("Total = "+total);

        total = Sum2(65, 48);
        System.out.println("Total = "+total);

        total = Sum2(124, 56);
        System.out.println("Total = "+total);
        System.out.println();



        //3rd function returns boolean result of comparing 2 arguments
        System.out.println("Exercise #3");


        int a = 12;
        System.out.println("Is it Even? - " +(isEven(a)));

        a = 53;
        System.out.println("Is it Even? - " +(isEven(a)));

        a = 123;
        System.out.println("Is it Even? - " +(isEven(a)));



    }



}

