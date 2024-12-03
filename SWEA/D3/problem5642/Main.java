package SWEA.D3.problem5642;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc < T+1; tc++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
                if (sum > max) max = sum;
                if (sum < 0) sum = 0;
            }

            System.out.printf("#%d %d\n", tc, max);
        }
    }
}
