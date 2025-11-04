package Programmers._2016년;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(solution(a,b));
    }

    public static String solution(int a, int b) {

        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int answer = 0;

        for (int i = 0; i < a - 1; i++) {
            answer += days[i];
        }

        answer += b - 1;

        return week[answer % 7];
    }
}
