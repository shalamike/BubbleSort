package org.sparta;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 2, 4, 5, 8, 3};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}