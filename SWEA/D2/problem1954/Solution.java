package SWEA.D2.problem1954;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        for (int tc = 1; tc <= T; tc++) {
            int n = Integer.parseInt(br.readLine());

            int[][] snail = new int[n][n];

            int x = 0;
            int y = 0;
            int d = 0;
            int cnt = 1;

            while(cnt <= n*n){
                snail[x][y] = cnt++;
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx < 0 || nx >= n ||ny < 0 || ny >= n || snail[nx][ny] != 0 ){
                    d = (d + 1)%4;
                    nx = x + dx[d];
                    ny = y + dy[d];
                }
                x = nx;
                y = ny;
            }

            System.out.println("#" + tc);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(snail[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}
