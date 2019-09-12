package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int maxOne = first > second ? first : second;
        int result = third > maxOne ? third : maxOne;
        // if ...
        return result;
    }
}