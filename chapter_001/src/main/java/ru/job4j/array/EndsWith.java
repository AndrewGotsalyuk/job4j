package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int m = 0;
        for (int i = (word.length - post.length); i < word.length; i++, m++) {
            if (post[m] != word[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}