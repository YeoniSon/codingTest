package codingTestBook.스택.problem13;

import java.util.Stack;

public class Main {
    private static int solution(int[][] board, int[] moves) {
        Stack<Integer>[] lines = new Stack[board.length];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = new Stack<>();
        }

        for (int i = board.length -1; i >= 0; i--) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] > 0) {
                    lines[i].push(board[i][j]);
                }
            }
        }
        Stack<Integer> bucket = new Stack<>();
        int answer = 0;

        for (int move : moves) {
            if (!lines[move - 1].isEmpty()) {
                int doll = lines[move -1].pop();
                if (!bucket.isEmpty() && bucket.peek() == doll) {
                    bucket.pop();
                    answer += 2;
                } else {
                    bucket.push(doll);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(solution(board, moves));
    }
}
