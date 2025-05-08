package BackJoon.스택_큐_덱.problem2346;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Balloon> queue = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] location = new int[n];

        for (int i = 0; i < n; i++) {
            location[i] = Integer.parseInt(st.nextToken());
        }

        sb.append("1 ");

        int move = location[0];

        for (int i = 1; i < n; i++) {
            queue.add(new Balloon(i+1, location[i]));
        }

        while(!queue.isEmpty()) {
            if (move > 0) {
                for (int i = 1; i < move; i++) {
                    queue.add(queue.poll());
                }

                Balloon next = queue.poll();
                move = next.numValue;
                sb.append(next.index+ " ");
            }
            else {
                for (int i = 1; i < -move; i++) {
                    queue.addFirst(queue.pollLast());
                }
                Balloon next = queue.pollLast();
                move = next.numValue;
                sb.append(next.index+ " ");
            }
        }
        System.out.println(sb);
    }
}
class Balloon{
    int index;
    int numValue;

    public Balloon(int index, int numValue) {
        this.index = index;
        this.numValue = numValue;
    }
}
