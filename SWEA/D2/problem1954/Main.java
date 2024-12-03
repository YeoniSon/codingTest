package SWEA.D2.problem1954;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int tc = 1; tc < T+1; tc++) {
            int n = sc.nextInt();

            int[][] arr = new int[n][n];

            int x = 0;
            int y = 0;
            int d = 0;
            int cnt = 1;

            while (cnt <= n*n){
                arr[x][y] = cnt++;
                int nx = x + dx[d];
                int ny = y + dy[d];
                if (nx < 0 || nx >= n ||ny < 0 || ny >= n || arr[nx][ny] != 0){
                    d = (d+1) % 4;
                    nx = x + dx[d];
                    ny = y + dy[d];
                }
                x = nx;
                y = ny;
            }
            System.out.printf("#%d\n", tc);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
