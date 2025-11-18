package codingTestBook.배열.problem4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] answers = new int[N];
        for (int i = 0; i < N; i++) {
            answers[i] = Integer.parseInt(st.nextToken());
        }
        int[][] pattern = {
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };

        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (answers[i] == pattern[j][i% pattern[j].length]) {
                    score[j]++;
                }
            }
        }

        int maxScore = Arrays.stream(score).max().getAsInt();

        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (score[i] == maxScore) {
                answer.add(i + 1);
            }
        }
        System.out.println(Arrays.toString(answer.stream().mapToInt(Integer::intValue).toArray()));
    }
}
