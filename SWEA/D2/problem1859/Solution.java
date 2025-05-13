package SWEA.D2.problem1859;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for (int t = 1; t <= tc; t++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int max = 0;
            int sum = 0;

            for (int i = n-1; i >= 0; i--) {
                if (arr[i] < max) {
                    sum = sum + (max - arr[i]);
                }else if (arr[i] >= max) {
                    max = arr[i];
                }
            }
            System.out.printf("#%d %d\n", t, sum);
        }
    }
}
