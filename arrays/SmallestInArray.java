package arrays;

public class SmallestInArray {

    static int smallestInArray(int[] array){

        int smallest = Integer.MAX_VALUE;
        for (int number : array) {
            if(number < smallest){
                smallest = number;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {

        int[] array = { 3, 5 , 7, 4 ,9, 10 , 1 , 6 };
        System.out.println(smallestInArray(array));
    }
}
