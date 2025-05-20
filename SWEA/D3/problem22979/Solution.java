package SWEA.D3.problem22979;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            String s = sc.next();
            int k = sc.nextInt();

            //덱을 이용하여 작성
            Deque<Character> c = new ArrayDeque<>();

            for (int i = 0; i < s.length(); i++) {
                c.offer(s.charAt(i));
            }

            for (int i = 0; i < k; i++) {
                int x = sc.nextInt();

                // 시간 초과를 막기 위해 x를 문자열 길이로 나눈 나머지로 줄인다.
                x = x % s.length();
                if (x > 0) {
                    for (int j = 0; j < x; j++) {
                        char tmp = c.pollFirst();
                        c.offerLast(tmp);

                    }
                }else if (x < 0) {
                    for (int j = 0; j < Math.abs(x); j++) {
                        char tmp = c.pollLast();
                        c.offerFirst(tmp);
                    }
                }
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                sb.append(c.pollFirst());
            }
            System.out.println(sb);
        }
    }
}
