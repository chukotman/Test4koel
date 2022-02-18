package interview;

import java.util.*;

public class RepeatingNumbers {
    public static void main(String[] args) {
        Integer[] numbers = {1,3,1,56,32,54,89,90,565,23,56,224,45,234,32,56,89,34};

        Set<Integer> list = new HashSet<Integer>(Arrays.asList(numbers));
//        List<Integer> list = new ArrayList<>();
//        for (int n : numbers){
//            if(!list.contains(n)){
//                list.add(n);
//            }
//        }
        for (int n : list){
            int count = 0;
            for (int x : numbers){
                if(x==n){
                    count++;
                }
            }
            if (count>1){
                System.out.println(n+" repeating = "+count);
            }
        }
    }
}
