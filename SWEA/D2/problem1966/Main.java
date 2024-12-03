package SWEA.D2.problem1966;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc < T+1; tc++) {
            int n = sc.nextInt();
            int[] num = new int[n];

            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }

            Arrays.sort(num);

            System.out.print("#"+ tc+ " ");
            for (int i = 0; i < n; i++) {
                System.out.printf("%d ", num[i]);
            }
            System.out.println();
        }
    }
}
