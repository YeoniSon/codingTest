package BackJoon.스택_큐_덱.problem2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        while(deque.size() > 1) {
            deque.pollFirst();

            int tmp = deque.pollFirst();
            deque.offerLast(tmp);
        }

        System.out.println(deque.pop());
    }
}
