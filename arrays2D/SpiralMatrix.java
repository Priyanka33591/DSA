package arrays2D;

public class SpiralMatrix {

    public static void printSpiralMatrix(int[][] matrix) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            //top
            for (int top = startCol; top <= endCol; top++) {
                System.out.print((matrix[startRow][top]) + " ");
            }

            //right
            for (int right = startRow + 1; right <= endRow; right++) {
                System.out.print(matrix[right][endCol] + " ");
            }
 
            //bottom
            for (int bottom = endCol - 1; bottom >= startCol; bottom--) {
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][bottom] + " ");
            }

            //left
            for (int left = endRow - 1; left >= startRow + 1; left--) {
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[left][startCol] + " ");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;

        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7 , 8 , 9}};
        printSpiralMatrix(matrix);
    }
}
