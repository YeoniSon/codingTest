package BackJoon.스택_큐_덱.problem9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            sb.append(solve(br.readLine())).append('\n');
        }
        System.out.println(sb);

    }

    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            //괄호일 경우 스택에 넣기
            if (c == '(') {
                stack.push(c);
            }
            // 아래는 모두 닫는 괄호 일 경우

            // 스택이 비어있는 경우. 즉, 닫는 괄호를 입력받았으나 pop할 원소가 없을 경우
            else if (stack.empty()) {
                return "NO";
            }

            // 그 외의 경우 stack 원소를 pop한다.
            else {
                stack.pop();
            }
        }

        if (stack.empty()) {
            return "YES";
        }else {
            return "NO";
        }
    }
}
