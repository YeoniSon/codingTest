package BackJoon.스택_큐_덱.problem11866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        sb.append("<");

        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j < k; j++) {
                int tmp = deque.pollFirst();
                deque.offerLast(tmp);
            }
            sb.append(deque.pollFirst()).append(", ");
        }

        sb.append(deque.pollFirst());
        sb.append(">");

        System.out.println(sb);
    }
}
