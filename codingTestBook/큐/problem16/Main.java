package codingTestBook.큐.problem16;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

// 기능개발 프로그래머스 문제
public class Main {
    private static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> answer = new ArrayDeque<>();
        int n = progresses.length;
        int[] daysLeft = new int[n];
        for (int i = 0; i < n; i++) {
            daysLeft[i] = (int) Math.ceil((100.0 - progresses[i])/speeds[i]);
        }
        int cnt = 0;
        int maxDay = daysLeft[0];

        for (int i = 0; i < n; i++) {
            if (daysLeft[i] <= maxDay){
                cnt++;
            } else {
                answer.add(cnt);
                cnt = 1;
                maxDay = daysLeft[i];
            }
        }
        answer.add(cnt);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] progresses1 = {93,30,55};
        int[] progresses2 = {95,90,99,99,80,99};
        int[] speeds1 = {1,30,5};
        int[] speeds2 = {1,1,1,1,1,1};
        System.out.println(Arrays.toString(solution(progresses1, speeds1)));
        System.out.println(Arrays.toString(solution(progresses2, speeds2)));
    }
}
