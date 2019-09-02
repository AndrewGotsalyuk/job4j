package ru.job4j.loop;

public class Fitness {
    public int calc(int ivan, int nik) {
        int month = 0;
        int powerIvan = 3;
        int powerNik = 2;
        while (ivan < nik) {
            ivan *= powerIvan;
            nik *= powerNik;
            month++;
        }
        return month;
    }
}

