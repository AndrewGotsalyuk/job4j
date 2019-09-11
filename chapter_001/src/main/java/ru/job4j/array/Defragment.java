package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {

        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            String tmp = null;
            if (cell == null) {
                for (int j = index + 1; j < array.length; j++)
                {
                    if (array[j] != null)
                    {
                        tmp = array[j];
                        array[j] = array[index];
                        array[index] = tmp;
                        break;
                    }
                }

//                array[i] = array[index];
//                while (i < array.length - 2)
//                    array[i] = array[i + 1];
//                    array[i + 1] = null;
//                    break;
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