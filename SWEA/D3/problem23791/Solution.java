package SWEA.D3.problem23791;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int n = sc.nextInt();

            int[] A = new int[n];
            int[] B = new int[n];

            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                B[i] = sc.nextInt();
            }

            boolean[] picked = new boolean[n+1];
            char[] select = new char[n];

            int aIdx = 0, bIdx = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) { //A팀 차례
                    while(picked[A[aIdx]]){
                        aIdx++;
                    }
                    picked[A[aIdx]] = true;
                    select[A[aIdx]-1] = 'A';
                } else {
                    while(picked[B[bIdx]]){
                        bIdx++;
                    }
                    picked[B[bIdx]] = true;
                    select[B[bIdx]-1] = 'B';
                }
            }

            System.out.println(new String(select));
        }
    }
}
