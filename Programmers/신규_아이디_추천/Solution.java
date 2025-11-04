package Programmers.신규_아이디_추천;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String new_id = sc.nextLine();

        System.out.println(solution(new_id));
    }

    private static String solution(String new_id) {
        String answer = "";

        // 1단계 - new_id의 모든 대문자를 대응되는 소문자로 치환
        answer = new_id.toLowerCase();

        // 2단계 - new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        answer = answer.replaceAll("[^a-z0-9-_.]", "");

        // 3단계 - new_id에서 (.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        answer = answer.replaceAll("\\.+", ".");

        // 4단계 - new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거
        answer = answer.replaceAll("^[.]|[.]$", "");

        // 5단계 - new_id가 빈 문자열이라면 "a"출력
        if (answer.isEmpty()) {
            answer = "a";
        }

        // 6단계 - new_id가 15글자 이상이라면 나머지는 모두 제거
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }

        // 7단계 - new_id가 2글자 이하이면 마지막 글자 추가
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }

        return answer;
    }
}
