package codingTestBook.큐.problem15;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    private static int solution(int n, int k) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                queue.add(queue.poll());
            }
            queue.poll();
        }
        int answer = queue.poll();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5,2));
    }
}
