package interview;

import java.util.Random;

public class Dices {
    public static void main(String[] args) {
        int number = 5;

        int[] dices = throwDices(number);
        for (int i = 0; i<number;i++){
            System.out.print(dices[i]+" ");
        }
        System.out.println();
        int count = getCount(dices);
        System.out.println(count);
    }

    private static int getCount(int[] dices) {
        int count = 0;
        for (int dice : dices) {
            if (dice == 1) {
                count += 2;
                continue;
            }
            if (dice == 6) {
                continue;
            }
            count++;
        }
        return count;
    }

    private static int[] throwDices(int number) {
        int[]dices = new int[number];
        Random random = new Random();
        for (int i=0;i<number;i++){
            dices[i] = random.nextInt(6)+1;
        }
        return dices;
    }
}
