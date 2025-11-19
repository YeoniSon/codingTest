package codingTestBook.큐.problem17;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
    private static String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> card1 = new ArrayDeque<>(Arrays.asList(cards1));
        Queue<String> card2 = new ArrayDeque<>(Arrays.asList(cards2));
        Queue<String> goals = new ArrayDeque<>(Arrays.asList(goal));

        while (!goals.isEmpty()) {
            if (!card1.isEmpty() && card1.peek().equals(goals.peek())) {
                card1.poll();
                goals.poll();
            } else if (!card2.isEmpty() && card2.peek().equals(goals.peek())) {
                card2.poll();
                goals.poll();
            }else {
                break;
            }
        }
        return goals.isEmpty() ? "Yes": "No";
    }

    public static void main(String[] args) {
        String[] cards1_1 = {"i", "drink", "water"};
        String[] cards1_2 = {"want", "to"};
        String[] goal1 = {"i","want","to","drink", "water"};
        String[] cards2_1 = {"i", "want", "drink"};
        String[] cards2_2 = {"want", "to"};
        String[] goal2 = {"i", "want","to", "drink", "water"};

        System.out.println(solution(cards1_1, cards1_2, goal1));
        System.out.println(solution(cards2_1, cards2_2, goal2));

    }
}
