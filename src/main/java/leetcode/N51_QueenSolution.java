package leetcode;
import java.util.ArrayList;
import java.util.List;

public class N51_QueenSolution {
    public List<List<String>> solveNQueens(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }

        Board board = new Board(n);
        List<List<String>> foundSolutions = new ArrayList<>();
        placeQueenOfNum(1, n, board, foundSolutions);

        return foundSolutions;
    }

    private void placeQueenOfNum(int noOfQueen, int n, Board board, List<List<String>> foundSolutions) {
        if (noOfQueen > n) {
            foundSolutions.add(board.toDescriptionString());
            return;
        }

        int row = noOfQueen - 1; /* add a limitation that for i-th queen, it can be only placed at i-th row */
        for (int col = 0; col < n; ++ col) {
            if (board.canPlaceQueenAt(row, col)) {
                board.placeQueenAt(row, col);
                placeQueenOfNum(noOfQueen + 1, n, board, foundSolutions);
                board.reset(row, col);
            }
        }
    }

    public static class Board {
        boolean[][] board;

        public Board(int n) {
            board = new boolean[n][n];
        }

        public void placeQueenAt(int row, int col) {
            board[row][col] = true;
        }

        public void reset(int row, int col) {
            board[row][col] = false;
        }

        public List<String> toDescriptionString() {
            List<String> description = new ArrayList<>();
            for (int row = 0; row < board.length; ++ row) {
                StringBuilder sb = new StringBuilder();
                for (int col = 0; col < board.length; ++ col) {
                    if (board[row][col]) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                description.add(sb.toString());
            }
            return description;
        }

        public boolean canPlaceQueenAt(int row, int col) {
            boolean unavailable = board[row][col]
                    // || isUnavailableFromSameRow(row) // already covered by row limitation
                    || isUnavailableFromSameCol(col)
                    || isUnavailableFromSameDiagonal(row, col)
                    || isUnavailableFromSameDiagonal2(row, col);

            return !unavailable;
        }

        private boolean isUnavailableFromSameCol(int col) {
            for (int i = 0;i < board.length;++i) {
                if (board[i][col]) {
                    return true;
                }
            }
            return false;
        }

        private boolean isUnavailableFromSameDiagonal(int row, int col) {
            // leveraged the assumption that queen is assigned row by row in ascending order
            int curRow = row - 1;
            int curCol = col - 1;
            while (curRow >= 0 && curCol >= 0) {
                if (board[curRow][curCol]) {
                    return true;
                }
                curRow--;
                curCol--;
            }
            return false;
        }


        private boolean isUnavailableFromSameDiagonal2(int row, int col) {
            // leveraged the assumption that queen is assigned row by row in ascending order
            int curRow = row - 1;
            int curCol = col + 1;
            while (curRow >= 0 && curCol < board.length) {
                if (board[curRow][curCol]) {
                    return true;
                }
                curRow--;
                curCol++;
            }
            return false;
        }
    }
}
