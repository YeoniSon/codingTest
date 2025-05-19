package SWEA.D2.problem1928;

import java.util.Base64;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            String s = sc.next();

            String result = new String(Base64.getDecoder().decode(s));
            System.out.println("#" + tc + " " + result);
        }
    }
}
