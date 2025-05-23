package SWEA.D3.problem17319;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean isSame = false;

            if (n % 2 == 0) {
                int mid = n / 2;
                isSame = s.substring(0, mid).equals(s.substring(mid));
            }

            System.out.println(isSame ? "#"+test_case + " " +"Yes" : "#" + test_case + " " + "No");

        }
    }
}
