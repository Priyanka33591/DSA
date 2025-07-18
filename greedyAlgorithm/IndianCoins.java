package greedyAlgorithm;

import java.util.ArrayList;

public class IndianCoins {
    public static void main(String[] args) {
        int[] coins = {2000 ,500,100,50,20,10,5,2,1};

        int count = 0;
        int amount = 1059;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int coin : coins) {
            if (amount >= coin) {
                while (amount >= coin) {
                    count++;
                    ans.add(coin);
                    amount = amount - coin;
                }
            }
        }
        
        System.out.println(count);
        System.out.println(ans);
    
    }
}
