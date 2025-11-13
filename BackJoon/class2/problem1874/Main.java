package BackJoon.class2.problem1874;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        int last_value = 0;

        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();
            if (value > last_value) {
                for (int j = last_value+1; j <= value ; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                last_value = value;
            }else {
                if (stack.peek() != value) {
                    System.out.println("NO");
                    return;
                }
            }

            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}
