package RECURSION;

public class N_Queens {
    public static void main(String[] args) {
        String[][] grid = {{".", ".", ".", "."}, {".", ".", ".", "."}, {".", ".", ".", "."}, {".", ".", ".", "."}};
        NQueens (grid, 0); for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[ i ].length; j++) {
                System.out.print (grid[ i ][ j ] + " ");
            } System.out.println ();
        }
    }

    static boolean NQueens(String[][] grid, int row) {
        //base case
        if (row == grid.length) return true;

        for (int i = 0; i < grid[ 0 ].length; i++) {
            if (isValid (grid, row, i)) {
                grid[ row ][ i ] = "Q"; if (NQueens (grid, row + 1)) {
                    return true;
                } grid[ row ][ i ] = ".";
            }
        } return false;
    }

    static boolean isValid(String[][] grid, int row, int col) {
        for (int i = row; i >= 0; i--) {
            if (grid[ i ][ col ] == "Q") return false;
        } for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (grid[ i ][ col ] == "Q") return false;
        } for (int i = row, j = col; i >= 0 && j < grid[ 0 ].length; i--, j++) {
            if (grid[ i ][ col ] == "Q") return false;
        } return true;
    }
} 
