package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index < finish; index++) {
            if (data[index] == el) {
                rst = index;

            }
        }
        return rst;
    }

    public int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = data[i];
            int minId = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                    minId = j;
                }
            }
            int temp = data[i];
            data[i] = min;
            data[minId] = temp;
        }
        return data;
    }
}