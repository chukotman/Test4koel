package hwork.lesson15;

public class App1_exceptions {
    private static final int HELLO = 7;
    public static void main(String[] args) {
        System.out.println("Start of the program");
        int[] numbers = {1, 1, 2};
        int a = 5;
        int b = 0;

        try {

            System.out.println("In the try block before exception");

//        int x = a/b;
            numbers[2] = 8;
            throw new IllegalArgumentException("Wrong Wrong");
        } catch (ArrayIndexOutOfBoundsException err){
            System.out.println("In the catch block");
        } catch (ArithmeticException err){
            System.out.println("In the second catch block");
        } catch (Exception err){
            System.out.println("this catches any exceptions");
        } finally {
            System.out.println("This block");
        }

        System.out.println("End of the program");
    }
}
