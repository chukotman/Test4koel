package interview;


public class Remainder {
    public static void main(String[] args) {
        // %
        // 30 % 7 = 2

        int rem = remainder1(30,7);
        System.out.println(rem);

        rem = remainder2(30,7);
        System.out.println(rem);
    }

    private static int remainder2(int a, int b) {
        while (a>=b){
            a=a-b;
        }
        return a;
    }

    private static int remainder1(int a, int b) {
        return a-(a/b)*b;
    }
}
