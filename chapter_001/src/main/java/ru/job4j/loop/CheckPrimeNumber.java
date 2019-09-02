package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int finish) {
        boolean prime = true;
        if ((finish % 2) == 0) {
            prime = false;
        }
        return prime;
    }
}