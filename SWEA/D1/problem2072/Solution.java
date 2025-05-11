package SWEA.D1.problem2072;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num % 2 != 0) {
                    sum += num;
                }
            }
            System.out.println("#" + i + " " + sum);
        }
    }
}
