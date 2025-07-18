package arrays;

public class LinearSearch {

    static int intLinearSearch(int[] array , int key){
        for (int i = 0; i < array.length; i++) {
            if(key == array[i]){
                return i;
            }
        }
        return -1;
    }

    static int stringLinearSearch(String[] array2 , String key){
        for (int i = 0; i < array2.length; i++) {
            if(key.equals(array2[i])){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 2 , 3, 5, 7 ,1 , 4};
        System.out.println(intLinearSearch(array , 5));

        String[] menu = {"dosa" , "pasta" , "tea" , "coffee" , "maggie"};
        System.out.println(stringLinearSearch(menu, "maggie"));
    }
}
