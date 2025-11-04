package Programmers.문자열_내_마음대로_정렬하기;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scan.next();
        }
        int m = scan.nextInt();

        System.out.println(solution(strings, m));
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) > o2.charAt(n)) return 1;
                else if (o1.charAt(n) < o2.charAt(n)) return -1;
                else if (o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
                else return 0;
            }
        });

        return strings;
    }
}
