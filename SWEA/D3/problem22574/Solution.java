package SWEA.D3.problem22574;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
                if (sum == p) {
                    sum--; //P층을 피함
                }
            }
            System.out.println(sum);
        }
    }
}
