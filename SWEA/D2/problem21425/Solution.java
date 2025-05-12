package SWEA.D2.problem21425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int a;
    static int b;
    static int n;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int t = 1; t <= tc; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());

            cnt = 0;

            if (a > b) {
                dfs(a, b);
            }else {
                dfs(b, a);
            }

            System.out.println(cnt);
        }
    }

    public static void dfs(int a, int b) {
        int sum = a + b;
        cnt++;

        if (sum > n) {
            return;
        }
        dfs(sum, a);
    }
}
