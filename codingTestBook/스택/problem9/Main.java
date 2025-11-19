package codingTestBook.스택.problem9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    private static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        while(n > 0) {
            stack.push(n % 2);
            n /= 2;
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        System.out.println(solution(num));
    }
}
