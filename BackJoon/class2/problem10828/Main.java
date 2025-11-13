package BackJoon.class2.problem10828;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = new Stack<>();
        int num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            String order = sc.next();

            switch (order) {
                case "push":
                    stack.push(sc.nextInt());
                    break;

                case "pop":
                    if(stack.isEmpty()) {
                        sb.append(-1).append('\n');
                        // System.out.println(-1);
                    } else {
                        sb.append(stack.pop()).append('\n');
                        // System.out.println(stack.pop());
                    }
                    break;

                case "size":
                    sb.append(stack.size()).append('\n');
                    // System.out.println(stack.size());
                    break;

                case "empty":
                    if(stack.isEmpty()) {
                        sb.append(1).append('\n');
                        // System.out.println(1);
                    }
                    else {
                        sb.append(0).append('\n');
                        // System.out.println(0);
                    }
                    break;

                case "top":
                    if(stack.isEmpty()) {
                        sb.append(-1).append('\n');
                        // System.out.println(-1);
                    }
                    else {
                        sb.append(stack.peek()).append('\n');
                        // System.out.println(stack.peek());
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
