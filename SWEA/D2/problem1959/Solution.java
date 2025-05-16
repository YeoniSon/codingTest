package SWEA.D2.problem1959;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int result = 0;

            int[] a = new int[n];
            int[] b = new int[m];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i <= Math.abs(n-m); i++) {
                int sum = 0;
                for (int j = 0; j < Math.min(n,m); j++) {
                    if (n > m) {
                        sum += a[i+j] * b[j];
                    }else {
                         sum += a[j] * b[i + j];
                    }
                }
                result = Math.max(result, sum);
            }
            System.out.printf("#%d %d\n", tc, result);
        }
    }
}
