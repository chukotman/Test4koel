package interview;

import java.util.Arrays;
import java.util.Locale;

public class Anagrams {
    public static void main(String[] args) {
        boolean result = isAnagram("Elbow","Below");
        System.out.println(result);
    }

    private static boolean isAnagram(String word1, String word2) {
        if (word1.length()!=word2.length()){
            return false;
        }
        String w1 = word1.toLowerCase();
        String w2 = word2.toLowerCase();

        char[]arr1 = w1.toCharArray();
        char[]arr2 = w2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0;i< arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
