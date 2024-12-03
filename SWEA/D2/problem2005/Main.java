package SWEA.D2.problem2005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc < T+1; tc++) {
            int n = sc.nextInt();
            int[][] map = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (i == j) {
                        map[i][j] = 1;
                    }else if (j == 0){
                        map[i][j] = 1;
                    }else {
                        map[i][j] = map[i-1][j-1] + map[i-1][j];
                    }
                }
            }
            System.out.println("#"+ tc);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
