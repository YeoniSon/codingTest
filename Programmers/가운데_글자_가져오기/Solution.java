package Programmers.가운데_글자_가져오기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String answer = "";

        int center = s.length() / 2;

        if (s.length() % 2 == 0) {
            answer = s.substring(center-1, center + 1);
        } else {
            answer = String.valueOf(s.charAt(center));
        }
        return answer;
    }
}