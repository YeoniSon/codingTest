package codingTestBook.스택.problem8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        char[] a = s.toCharArray();
        System.out.println(solution(a));
    }

    private static boolean solution(char[] arr) {
        Stack<Character> stack = new Stack<Character>();
        for(char c: arr) {
            if (c == '(') {
                stack.push(c);
            }else {
                if (stack.isEmpty() || stack.pop() == c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
