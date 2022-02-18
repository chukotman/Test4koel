package interview;

public class Replace {
    public static void main(String[] args) {
        int a = 5;
        int b = 33;

//        a=a+b;
//        b=a-b;
//        a=a-b;

        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println("a="+a+" b="+b);
    }
}
