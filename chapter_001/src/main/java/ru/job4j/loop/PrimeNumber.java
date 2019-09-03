package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int start = 1; start <= finish; start++) {
            for (int i = 2; i <= start; i++) {
                if (start % i == 0) {
                } else count++;
                break;
            }
        }
        return count;
    }
}