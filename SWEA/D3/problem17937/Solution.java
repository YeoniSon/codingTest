package SWEA.D3.problem17937;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();

            if (a.equals(b)) {
                System.out.printf("#%d %d\n", test_case, a);
            }else {
                System.out.printf("#%d 1\n", test_case);
            }
        }
    }
}
