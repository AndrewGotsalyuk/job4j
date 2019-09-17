package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int arrL = 0;
        int arrR = 0;
        while (arrL < left.length && arrR < right.length) {
            if (left[arrL] <= right[arrR]) {
                rsl[arrL + arrR] = left[arrL];
                arrL++;
            } else {
                rsl[arrL + arrR] = right[arrR];
                arrR++;
            }
        }
        if (arrL >= left.length) {
            while (arrR < right.length) {
                rsl[arrL + arrR] = right[arrR];
                arrR++;
            }
        } else if (arrR >= right.length) {
            while (arrL < left.length) {
                rsl[arrL + arrR] = left[arrL];
                arrL++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}