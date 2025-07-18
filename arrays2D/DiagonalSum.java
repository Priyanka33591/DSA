package arrays2D;

public class DiagonalSum {

    public static int diagonalSum(int[][] mat) {

        int firstSum = 0;
        int secondSum = 0;

        int n = mat.length - 1;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j) {
                    firstSum = firstSum + mat[i][j];
                }
                if ((i + j) == n && (i != j)) {
                    secondSum = secondSum + mat[i][j];
                }
            }
        }

        return firstSum + secondSum;

    }

    public static int diagonalSum2(int[][] mat) {

        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            //for primary diagonal
            sum = sum + mat[i][i];

            //for secondary diagonal
            if (i != (mat.length - 1 - i)) {
                sum = sum + mat[i][mat.length - 1 - i];
            }
        }

        return sum;

    }

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(matrix));
        System.out.println(diagonalSum2(matrix));
    }
}
