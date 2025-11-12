package BackJoon.class2.problem2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] apt = new int[k+1][n];

            for (int j = 1; j <= n; j++) {
                apt[0][j-1] = j;
            }
            for (int j = 1; j <= k; j++) {
                apt[j][0] = 1;
                for (int l = 1; l < n; l++) {
                    apt[j][l] = apt[j-1][l] + apt[j][l-1];
                }
            }

            System.out.println(apt[k][n-1]);
        }
    }
}
