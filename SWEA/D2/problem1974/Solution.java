package SWEA.D2.problem1974;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int[][] sdoku = new int[9][9];

            // 스도쿠 배열 작성
            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    sdoku[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 기본 결과값
            int result = 1;

            // 가로 체크
            for (int i = 0; i < 9; i++) {
                int[] arr = new int[9];

                for (int j = 0; j < 9; j++) {
                    arr[sdoku[i][j] - 1]++;
                }

                for (int j = 0; j < 9; j++) {
                    if (arr[j] == 0) {
                        result = 0;
                        break;
                    }
                }
            }

            // 세로 체크
            for (int j = 0; j < 9; j++) {
                int[] arr = new int[9];
                for (int i = 0; i < 9; i++) {
                    arr[sdoku[i][j]-1]++;
                }

                for (int i = 0; i < 9; i++) {
                    if (arr[i] == 0) {
                        result = 0;
                        break;
                    }
                }
            }

            // 3 x 3 체크
            for (int i = 0; i <= 6; i += 3) {
                for (int j = 0; j <= 6; j+=3) {
                    int[] arr = new int[9];

                    int r = i+3;
                    int c = j+3;

                    for (int k = i; k < r; k++) {
                        for (int l = j; l < c; l++) {
                            arr[sdoku[k][l]-1]++;
                        }
                    }

                    for (int k = 0; k < 9; k++) {
                        if (arr[k] == 0) {
                            result = 0;
                            break;
                        }
                    }
                }
            }
            System.out.printf("#%d %d\n", tc, result);
        }
    }
}
