package SWEA.D3.problem22039;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int  n = sc.nextInt();

            System.out.println(solve(n));


        }
    }
    public static String solve(int n) {
        // 피보나치 수열 계산(n까지)
        int[] fib = new int[n + 2]; // 인덱스 1부터 사용
        fib[1] = 1;
        if (n >= 2) fib[2] = 1;
        for (int i = 3; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // 전체 합 계산
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += fib[i];
        }

        // 전체 합이 홀수면 impossible
        if (sum % 2 != 0) {
            return "impossible";
        }

        // target = 절반 합 만들기(그리디)
        int target = sum / 2;
        boolean[] isA = new boolean[n + 1];

        for (int i = n; i >= 1; i--) {
            if (fib[i] <= target) {
                isA[i] = true;
                target -= fib[i];
            }
        }

        if (target != 0) {
            return "impossible";
        }

        // 결과 문자열 구성
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(isA[i] ? 'A' : 'B');
        }

        return sb.toString();
    }
}
