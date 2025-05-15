package SWEA.D2.problem1961;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            n = Integer.parseInt(br.readLine());
            int[][] matrix = new int[n][n];

            // 배열 넣기
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] arr90 = rotate(matrix);
            int[][] arr180 = rotate(arr90);
            int[][] arr270 = rotate(arr180);

            System.out.println("#" + tc);
            print(arr90, arr180, arr270);
        }
    }

    private static void print(int[][] arr90, int[][] arr180, int[][] arr270) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr90[i][j]);
            }
            System.out.print(" ");

            for (int j = 0; j < n; j++) {
                System.out.print(arr180[i][j]);
            }
            System.out.print(" ");

            for (int j = 0; j < n; j++) {
                System.out.print(arr270[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotate(int[][] matrix) {
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix[n-1-j][i];
            }
        }
        return result;
    }
}
