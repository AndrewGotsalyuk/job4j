package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int MaxOne = first > second ? first : second;
        int result = third > MaxOne ? third : MaxOne;
        // if ...
        return result;
    }
}