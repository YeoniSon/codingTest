package SWEA.D3.problem20934;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            String S = sc.next();
            int k = sc.nextInt();

            int curPos = S.indexOf("o");
            int newPos = newPosition(curPos, k);

            System.out.printf("#%d %d\n", tc, newPos);
        }
    }
    private static int newPosition(int curPos, int moves) {
        if (moves == 0) {
            return curPos;
        }

        if (curPos == 0 || curPos == 2) {
            //'o'가 양 끝인 경우
            return (moves % 2 == 0) ? 0 : 1; // 짝수면 0, 홀수면 1로 이동
        }else if (curPos  == 1) {
            return (moves % 2 == 0) ? 1 : 0; // 짝수면 1, 홀수면 0으로 이동
        }

        return curPos;
    }
}
