package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                System.out.print(sign);
            }
            System.out.println();
        }
        int x = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'X') {
                    x++;
                }
            }
            if (x == 5)
                result = true;
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

//    int x = 0;
//        for (int i = 0; i < board.length - 1; i++) {
//        if (board[0][0] == 'X') {              //(board[0][0] == board[i + 1][i + 1]) {         //|| (board[board.length - 1][0] == board[board.length - 1 - i][i])) {
//        x++;
//        }
//        }


//                    else (for (int i = 0; i < board.length; i++) {
//                        for (int j = 0; j < board.length; j++) {
//                            if (board[0][i] == board[0][j]) {
//                                result = true;
//                                break;
//                            }
//                           else if (board[i][0] == board[j][0]) {
//                                result = true;
//                                break;
//                            }
//                        }
//                    }
//                }
//                )


//for () { проверить последовательность.
//                for (int i = 0; i < board.length; i++) {
//                    for (int j = 0; j < board.length; j++) {
//                    if (board[0][i] == board[0][j]) {
//                        result = true;
//                        break;
//                    }
//                    else if (board[i][0] == board[j][0]) {
//                        result = true;
//                        break;
//                    }
//                    }