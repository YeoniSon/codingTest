package BackJoon.스택_큐_덱.problem28278;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        //stack 실행
        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < n; i++) {
            // 받는 숫자 체크
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            //숫자가 1일 경우
            if (num == 1) {
                stack.push(Integer.parseInt(st.nextToken()));

            }
            // 숫자가 2인 경우
            else if (num == 2) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                }else {
                    System.out.println(stack.pop());
                }
            }
            // 숫자가 3인 경우
            else if (num == 3) {
                System.out.println(stack.size());
            }
            // 숫자가 4인 경우
            else if (num == 4) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                }else {
                    System.out.println(0);
                }
            }
            //숫자가 5인 경우
            else {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                }else {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
