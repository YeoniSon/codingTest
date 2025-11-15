package BackJoon.class3.problem11723;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int M = Integer.parseInt(br.readLine());
        boolean[] S = new boolean[21];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "add" :
                    int x = Integer.parseInt(st.nextToken());
                    S[x] = true;
                    break;
                case "remove":
                    x = Integer.parseInt(st.nextToken());
                    S[x] = false;
                    break;
                case "check":
                    x = Integer.parseInt(st.nextToken());
                    sb.append(S[x] ? 1 : 0).append("\n");
                    break;
                case "toggle":
                    x = Integer.parseInt(st.nextToken());
                    S[x] = !S[x];
                    break;
                case "all":
                    Arrays.fill(S, true);
                    break;
                case "empty":
                    S = new boolean[21];
                    break;
            }
        }
        System.out.println(sb);
    }
}
