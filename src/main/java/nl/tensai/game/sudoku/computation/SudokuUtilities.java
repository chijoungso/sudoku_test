package nl.tensai.game.sudoku.computation;


import static nl.tensai.game.sudoku.constants.GameConstants.GRID_BOUNDARY;

public class SudokuUtilities {

    /**
     * Copy the values from one sudoku grid into another
     *
     * Note: O(n^2) Runtime Complexity
     * @param oldArray
     * @param newArray
     */
    public static void copySudokuArrayValues(int[][] oldArray, int[][] newArray) {
        for (int xIndex = 0; xIndex < GRID_BOUNDARY; xIndex++){
            for (int yIndex = 0; yIndex < GRID_BOUNDARY; yIndex++ ){
                newArray[xIndex][yIndex] = oldArray[xIndex][yIndex];
            }
        }
    }

    /**
     * Creates and returns a new Array with the same values as the inputted Array.
     *
     * @param oldArray
     */
    public static int[][] copyToNewArray(int[][] oldArray) {
        int[][] newArray = new int[GRID_BOUNDARY][GRID_BOUNDARY];
        copySudokuArrayValues(oldArray,newArray);
        return newArray;
    }
}