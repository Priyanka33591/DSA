package queue;

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveTwoHalvesOfAQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }

        System.out.println(q);

        Queue<Integer> first = new LinkedList<>();
        int n = q.size();

        for (int i = 0; i < n / 2; i++) {
            first.add(q.remove());
        }

        while (!first.isEmpty()) {

            q.add(first.remove());
            q.add(q.remove());

        }

        System.out.println(q);
    }
}
