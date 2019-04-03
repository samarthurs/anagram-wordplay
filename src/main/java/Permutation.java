package com.bestsecret;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        String str = "JAVA";
        int n = str.length();
        List<String> result = new ArrayList<>();
        Permutation.permute(str, 0, n - 1, result);

        System.out.println(result);
        System.out.println(result.size());
    }

    /**
     * @param str    string to calculate permutation for
     * @param left      starting index
     * @param right      end index
     * @param result
     */
    private static void permute(String str, int left, int right, List<String> result) {
        if (left == right) {
            result.add(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right, result);
                str = swap(str, left, i);
            }
        }
    }

    /**
     * Swap Characters at position in the Char array
     *
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
