package SWEA.D3.problem22795;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int[] worker = new int[6];

            for (int i = 0; i < worker.length; i++) {
                worker[i] = sc.nextInt();
            }

            Arrays.sort(worker);

            int max = worker[5];

            int sum = Arrays.stream(worker).sum();

            // 같으면 안되므로 최소값을 max + 1로 주어야 한다.
            int result = max+1;

            while(true) {
                if ((result + sum) % 7 != 0) {
                    result++;
                }else {
                    break;
                }
            }

            System.out.println(result);
        }
    }
}
