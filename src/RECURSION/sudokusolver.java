package RECURSION;

public class sudokusolver {
    public static void main(String[] args) {
        int[][] grid = {{3, 0, 6, 5, 0, 8, 4, 0, 0}, {5, 2, 0, 0, 0, 0, 0, 0, 0}, {0, 8, 7, 0, 0, 0, 0, 3, 1}, {0, 0, 3, 0, 1, 0, 0, 8, 0}, {9, 0, 0, 8, 6, 3, 0, 0, 5}, {0, 5, 0, 0, 9, 0, 6, 0, 0}, {1, 3, 0, 0, 0, 0, 2, 5, 0}, {0, 0, 0, 0, 0, 0, 0, 7, 4}, {0, 0, 5, 2, 0, 6, 3, 0, 0}};

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[ i ].length; j++) {
                System.out.print (grid[ i ][ j ] + " ");
            } System.out.println ();
        } sudoku (grid, 0, 0); System.out.println ("final sudoku puzzle"); for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[ i ].length; j++) {
                System.out.print (grid[ i ][ j ] + " ");
            } System.out.println ();
        }
    }

    static boolean sudoku(int[][] grid, int row, int col) {
        //base case..
        if (row == grid.length && col == grid[ 0 ].length) {
            return true;
        }


        if (col == grid[ 0 ].length) {
            row++; col = 0;
        } if (grid[ row ][ col ] != 0) {
            return sudoku (grid, row, col + 1);
        }
        //recursive case...
        for (int i = 1; i <= 9; i++) {
            if (isValid (grid, row, col, i)) {
                grid[ row ][ col ] = i; if (sudoku (grid, row, col + 1)) {
                    return true;
                }
            }
        } return false;
    }

    static boolean isValid(int[][] grid, int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (grid[ i ][ col ] == num || grid[ row ][ i ] == num) {
                return false;
            }
        } int sr = row - (row % 3); int sc = col - (col % 3); for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (grid[ i ][ j ] == num) {
                    return false;
                }
            }
        } return true;

    }
}