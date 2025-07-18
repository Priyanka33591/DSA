package backtracking;

public class Sudoku {
    public static void main(String[] args) {
        int[][] sudoku = {{2, 4, 0, 0, 0, 0, 0, 6, 0}, {0, 0, 0, 3, 0, 0, 2, 0, 9}, {1, 0, 0, 0, 0, 8, 5, 4, 0}, {0, 6, 1, 0, 0, 7, 0, 5, 0}, {9, 0, 0, 0, 0, 0, 0, 0, 4}, {0, 5, 0, 8, 0, 0, 9, 1, 0}, {0, 1, 9, 7, 0, 0, 0, 0, 6}, {8, 0, 4, 0, 0, 9, 0, 0, 0}, {0, 3, 0, 0, 0, 0, 0, 9, 1}};
        System.out.println(sudokuSolver(sudoku,0,0));
        System.out.println("____________________________________");
        for(int i = 0 ; i < sudoku.length;i++){
            System.out.print("|");
            for(int j = 0; j < sudoku.length;j++){
                System.out.print(sudoku[i][j] + " | ");
            }
            System.out.println();
            System.out.println("____________________________________");

//            tc- 0(9^(n*n))
//            sp - 0(n^2)  {call stack}
        }
    }

    public static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        //base case
        if (row == 9) {
            return true;
        }

        int nextRow = row;
        int nextCol = col + 1;
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        //recursion
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol )) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }


    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
//        col
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

//        row
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == digit) {
                return false;
            }
        }

//        grid
        int sr = (row / 3) * 3;
        int cl = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = cl; j < cl + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }


        return true;
    }


}
