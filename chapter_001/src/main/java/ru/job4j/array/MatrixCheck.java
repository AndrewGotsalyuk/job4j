package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int d1 = 0;
        int d2 = 0;
        int vert = 0;
        int gor = 0;
        for (int row = 0; row < board.length; row++) {
            // Проверка диагоналей на равенство Х.
            if (board[row][row] == 'X') {
                d1++;
            }
            if (board[row][board.length - 1 - row] == 'X') {
                d2++;
            }
            // Проверка диагоналей, вертикальных и горизонтальных линий на равенство Х.
            if (d1 == board.length || d2 == board.length || vert == board.length || gor == board.length) {
                result = true;
                break;
            } else {
                // Обнуление горизонтальных и вертикальных линий.
                vert = 0;
                gor = 0;
            }
            // Проверка горизнтальных и вертикальных линий на равенств Х.
            for (int cell = 0; cell < board.length; cell++) {
                if (board[row][cell] == 'X') {
                    gor++;
                }
                if (board[cell][row] == 'X') {
                    vert++;
                }
            }
            System.out.println();
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
    }
}