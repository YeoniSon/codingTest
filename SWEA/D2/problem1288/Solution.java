package SWEA.D2.problem1288;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            int num = 0;

            boolean[] visited = new boolean[10];

            while(cnt < 10) {
                num += n;

                String string_num = Integer.toString(num);

                for (int i = 0; i < string_num.length(); i++) {
                    int number = Integer.parseInt(string_num.substring(i, i + 1));
                    if (!visited[number]) {
                        visited[number] = true;
                        cnt += 1;
                    }
                }
            }
            System.out.printf("#%d %d\n", tc, num);
        }
    }
}
