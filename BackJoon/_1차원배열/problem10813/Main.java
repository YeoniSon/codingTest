package BackJoon._1차원배열.problem10813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] buckets;
    static StringBuilder sb = new StringBuilder();

    static void swapBall(int start, int end) {
        int tmp = buckets[start];
        buckets[start] = buckets[end];
        buckets[end] = tmp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        buckets = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            buckets[i] = i;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            swapBall(start, end);
        }

        for (int i = 1; i <= N; i++) {
            sb.append(buckets[i]).append(" ");
        }
        System.out.println(sb);

    }
}
