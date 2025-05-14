package SWEA.D2.problem2001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int tc = Integer.parseInt(br.readLine());

        for (int t = 1; t <= tc; t++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] bug = new int[n][n];
            int[][] arr = new int[m][m];

            // bug 배열에 파리의 개수
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    bug[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int max = 0;

            for (int i = 0; i < n - m + 1; i++) {
                for (int j = 0; j < n - m + 1; j++) {
                    int sum = 0;

                    for (int k = 0; k < m; k++) {
                        for (int l = 0; l < m; l++) {
                            sum += bug[i + k][j + l];
                        }
                    }
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
            System.out.printf("#%d %d\n", t, max);


        }


    }
}
