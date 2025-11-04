package Programmers.소수_찾기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(solution(n));
    }

    public static int solution(int n){
        int answer = 1;

        for (int i = 3; i <= n; i++) {
            if (isPrime(i)) answer += 1;
        }
        return answer;
    }

    private static boolean isPrime(int n){
        for (int i = 2; i <= (int)Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }
}
