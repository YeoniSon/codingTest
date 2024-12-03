package SWEA.D2.problem1285;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc < T+1; tc++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Math.abs(sc.nextInt());
            }
            Arrays.sort(arr);
            int min = arr[0];
            int cnt = 0;

            for (int i = 0; i < arr.length; i++) {
                if (min == arr[i]){
                    cnt++;
                }
            }
            System.out.printf("#%d %d %d",tc, min, cnt);
        }
    }
}
