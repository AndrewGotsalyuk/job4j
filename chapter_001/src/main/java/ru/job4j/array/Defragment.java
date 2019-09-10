package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int i = 0;
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                array[i++] = array[index];
                while (i < array.length)
                    array[i++] = null;
                // переместить первую не null ячейку
                // Здесь нужен цикл while
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}