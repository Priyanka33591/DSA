package arrays2D;

public class SearchInSortedMatrix {

    public static boolean searcher(int[][] matrix , int key){

        int row = 0;
        int col = matrix[0].length-1;
    
        while(row < matrix.length && col >= 0){

            if(matrix[row][col] == key){
                System.out.println(row + " " + col);
                return true;
            }else if(key > matrix[row][col]){
                row++;
            }else{
                col--;
            }
        }

        return false;

    }

    public static void main(String[] args) {

        int[][] matrix = {{10,20,30,40},
                         {15,25, 35, 46},
                         {27, 29, 37 , 48} ,
                         {32 , 33 , 39 , 50}};

        System.out.println(searcher(matrix,33));
    }
}
