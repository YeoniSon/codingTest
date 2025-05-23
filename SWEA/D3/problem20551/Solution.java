package SWEA.D3.problem20551;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int[] box = new int[3];

            for (int i = 0; i < box.length; i++) {
                box[i] = sc.nextInt();
            }

            int cnt = 0;

            // 박스는 1개 이상 이어야 하며, 순차적으로 증가하여야 하기 때문에
            if (box[2] < 3 || box[1] < 2 || box[0] < 1) {
                System.out.printf("#%d %d\n", tc, -1);
            }else {
                // 3번째 박스보다 2번째 박스가 크거나 같을 경우 cnt는 증가, 박스의 사탕 개수는 감소
                while (box[2] <= box[1]) {
                    box[1]--;
                    cnt++;
                }

                // 2번째 박스보다 첫번째 박스가 크거나 같을 경우 cnt는 증가, 박스의 사탕 개수는 감소
                while (box[1] <= box[0]) {
                    box[0]--;
                    cnt++;
                }

                System.out.printf("#%d %d\n", tc, cnt);
            }
        }
    }
}
