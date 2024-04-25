package exercise;

import java.util.Arrays;

public class Exercise2 {
    public static boolean isAnagram(String arr, String str1) {
        if (arr.length() != str1.length()) return false;
        arr = arr.toLowerCase();
        str1 = str1.toLowerCase();
        char[] arr1 = arr.toCharArray();
        char[] arr2 = str1.toCharArray();
        sorted(arr1);
        sorted(arr2);
        System.out.println(arr1);
        System.out.println(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static char[] sorted(char[] array){
        for (int index = 0; index < array.length; index++) {
            for (int idx = index + 1; idx < array.length; idx++) {
               if (array[idx] < array[index]) {
                   char temp  = array[idx];
                   array[idx] = array[index];
                   array[index] = temp;
               }
            }
        }
        return array;
    }
}
