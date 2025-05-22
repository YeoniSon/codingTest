package SWEA.D3.problem20955;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 0; tc < T; tc++) {
            String S = sc.next();
            String E = sc.next();

            ArrayList<Character> list = new ArrayList<>();

            for (int i = 0; i < E.length(); i++) {
                list.add(E.charAt(i));
            }

            for (int i = 0; i < E.length()-S.length(); i++) {
                if (list.get(list.size()-1) == 'X') {
                    list.remove(list.size()-1);
                }else {
                    list.remove(list.size()-1);
                    Collections.reverse(list);
                }
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
            }

            // 테스트케이스...ㅎㅎ
            if (sb.toString().equals(S)) {
                System.out.printf("#%d Yes\n", tc);
            }else {
                System.out.printf("#%d No\n", tc);
            }

        }

    }
}
