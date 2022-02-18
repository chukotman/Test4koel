package hwork;

public class Function2 {
    public static void main(String[] arg){

        //Exercise# 1
        int[] arr = {2, 3, 5, 6, 7, 8};
        System.out.println("Sum Array values: " +sum(arr));

        //Exercise# 2
        int[] arrForSort = {3, 9, 2, 8, 4, 8, 5};
        sort(arrForSort);

        //Exercise# 3
        System.out.println("Min Array Value: " +minArr(arrForSort));
    }


    //function takes int[] as a parametrs and returns Sum of all the elements
    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    //Funsction takes int[] as parametr and sorts array.
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for(int  j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    //takes an array and find a min value
    public static int minArr(int[] arr){
        int min = arr[0];
        for (int i : arr){
            if (min > i){
                min = i;
            }
        }
        return min;
    }

}

