package SWEA.D3.problem20019;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T  = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            String s = sc.next();

            System.out.printf("#%d %s\n", test_case, (isPalindromeOfPalindrome(s) ? "YES" : "NO"));
        }
    }

    public static boolean isPalindromeOfPalindrome(String s) {
        int n = s.length();

        // 전체 문자열 회문 확인
        if (!isPalindrome(s, 0, n-1)) {
            return false;
        }

        // 앞쪽 (n-1)/2 글자 회문 확인
        if (!isPalindrome(s, 0, (n-1)/2 - 1)){
            return false;
        }

        // 뒤쪽 (n-1)/2 글자 회문 확인
        if (!isPalindrome(s, n-(n-1)/2, n-1)) {
            return false;
        }

        return true;
    }

    public static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
