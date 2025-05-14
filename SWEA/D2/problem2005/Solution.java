package SWEA.D2.problem2005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for (int t = 1; t <= tc ; t++) {
            int n = Integer.parseInt(br.readLine());

            System.out.printf("#%d\n", t);

            int[][] pascal = new int[n][n];


            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (i == j) {
                        pascal[i][j] = 1;
                    }else if(j == 0) {
                        pascal[i][j] = 1;
                    }else {
                        pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(pascal[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
