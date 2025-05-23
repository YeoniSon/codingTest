package SWEA.D3.problem17642;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            long A = sc.nextLong();
            long B = sc.nextLong();

            if (A > B) {
                System.out.printf("#%d -1\n", test_case);
            }else if (A == B) {
                System.out.printf("#%d 0\n", test_case);
            } else {
                long diff = B - A;

                if (diff == 1) {
                    System.out.printf("#%d -1\n", test_case);
                }else if (diff % 2 == 0){
                    System.out.printf("#%d %d\n", test_case, diff/2);
                }else {
                    System.out.printf("#%d %d\n", test_case, (diff-3) / 2 +1);
                }
            }
        }
    }
}
