package Programmers.자릿수_더하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }

    public static int solution(int n){
        int answer = 0;
        String num = Integer.toString(n);
        for (int i = 0; i < num.length(); i++){
            answer += (int) num.charAt(i) - '0';
        }
        return answer;
    }
}
