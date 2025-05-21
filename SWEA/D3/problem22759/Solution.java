package SWEA.D3.problem22759;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int L = sc.nextInt();
            int R = sc.nextInt();

            if (L * 2 > R) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
