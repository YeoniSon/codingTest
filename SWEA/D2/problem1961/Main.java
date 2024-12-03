package SWEA.D2.problem1961;

import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc < T+1; tc++) {
            n = sc.nextInt();
            int[][] map = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            int[][] arr_90 = rotate(map);
            int[][] arr_180 = rotate(arr_90);
            int[][] arr_270 = rotate(arr_180);

            System.out.println("#"+tc);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr_90[i][j]);
                }
                System.out.print(" ");

                for (int j = 0; j < n; j++) {
                    System.out.print(arr_180[i][j]);
                }
                System.out.print(" ");

                for (int j = 0; j < n; j++) {
                    System.out.print(arr_270[i][j]);
                }
                System.out.println();
            }

        }
    }

    public static int[][] rotate(int[][] arr){
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = arr[n-1-j][i];
            }
        }

        return result;
    }
}
