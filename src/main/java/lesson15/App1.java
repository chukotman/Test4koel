package lesson15;

public class App1 {
    public static void main(String[] args) {
        System.out.println("Start of Program");
        int[]numbers = {1,1,2};

        int a = 5;
        int b = 0;

        try {
            System.out.println("In the try block before exception");
//            int x = a/b;
            numbers[2] = 8;
            System.out.println("In the try block after exception");
//            throw new IllegalArgumentException("WRONG WRONG");
        } catch (ArrayIndexOutOfBoundsException  err){
            System.out.println("In the catch block");
        } catch (ArithmeticException err) {
            System.out.println("In the second catch block");
        } catch (Exception err){
            System.out.println("It catch ANY Exception - Not good Idea");
        } finally {
            System.out.println("Will run in any case");
        }


        System.out.println("End of Program");
    }
}
