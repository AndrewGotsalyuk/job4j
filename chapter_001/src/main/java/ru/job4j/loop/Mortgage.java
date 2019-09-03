package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        int month = 0;
        int sum = 0;
        double allSum = amount + amount * (percent / 100);
        while (sum < allSum) {
            sum += monthly;
            month++;
        }
        year = (int) Math.ceil(month / 12);
        return year;
    }
}

