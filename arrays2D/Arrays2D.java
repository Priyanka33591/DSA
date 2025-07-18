package arrays2D;
import java.util.Scanner;

public class Arrays2D {

    static Scanner scan = new Scanner(System.in);

    public static int[][] create2DArrays(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        return matrix;
    }

    public static void print2DArrays(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int printLargestElement(int[][] matrix){

        int largest = Integer.MIN_VALUE;

        for(int i = 0; i< matrix.length ; i++){
            for(int j = 0 ;  j < matrix[i].length ; j++){
                largest = Math.max(largest , matrix[i][j]);
            }
        }
        return largest;
    }

    public static int printSmallestElement(int[][] matrix){

        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i< matrix.length ; i++){
            for(int j = 0 ;  j < matrix[0].length ; j++){
                smallest = Math.min(smallest, matrix[i][j]);
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int [][]matrix = new int[3][3];
        create2DArrays(matrix);
        print2DArrays(matrix);
        System.out.println("Largest element of matrix is " + printLargestElement(matrix));
        System.out.println("Smallest element of matrix is " + printSmallestElement(matrix));
    }
}
