package BackJoon.스택_큐_덱.problem28279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());

            switch (num) {
                case 1: deque.offerFirst(Integer.parseInt(st.nextToken())); break;
                case 2: deque.offerLast(Integer.parseInt(st.nextToken())); break;
                case 3: sb.append((deque.isEmpty() ? -1 : deque.pollFirst())).append("\n");break;
                case 4: sb.append((deque.isEmpty() ? -1 : deque.pollLast())).append("\n");break;
                case 5: sb.append(deque.size()).append("\n");break;
                case 6: sb.append((deque.isEmpty() ? 1 : 0)).append("\n");break;
                case 7: sb.append((deque.isEmpty() ? -1 : deque.peekFirst())).append("\n");break;
                case 8: sb.append((deque.isEmpty() ? -1 : deque.peekLast())).append("\n");break;
            }
        }
        System.out.println(sb);
    }
}
