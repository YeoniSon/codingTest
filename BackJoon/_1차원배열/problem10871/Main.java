package BackJoon._1차원배열.problem10871;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n, x;
        n = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(st.nextToken());

            if (value < x) {
                sb.append(value).append(' ');
            }
        }
        System.out.println(sb);
    }
}
