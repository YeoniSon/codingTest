package SWEA.D2.problem1204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int t = Integer.parseInt(br.readLine());

            int[] student = new int[101];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 1000; i++) {
                student[Integer.parseInt(st.nextToken())]++;
            }

            int max = 0;
            int idx = 0;

            for (int i = 100; i > 0; i--) {
                if (student[i] > max) {
                    max = student[i];
                    idx = i;
                }
            }
            System.out.printf("#%d %d\n", t, idx);

        }
    }
}
