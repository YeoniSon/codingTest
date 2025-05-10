package BackJoon.스택_큐_덱.problem24511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //입력값
        int N = Integer.parseInt(br.readLine());

        int[] listQueueStack = new int[N];
        int[] currList = new int[N];

        StringBuilder sb = new StringBuilder();

        //1번 리스트 = 자료구조의 형태
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            listQueueStack[i] = Integer.parseInt(st.nextToken());
        }

        //2번 리스트 = 자료구조의 요소
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            currList[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] insertList = new int[M];

        //3번 리스트 = 입력값 리스트
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            insertList[i] = Integer.parseInt(st.nextToken());
        }

        //Queue 생성
        Deque<Integer> queue = new ArrayDeque<>();

        //큐라면
        for (int i = 0; i < N; i++) {
            if (listQueueStack[i] == 0) {
                queue.addFirst(currList[i]);
            }
        }
        for (int i = 0; i < M; i++) {
            queue.add(insertList[i]);
            sb.append(queue.pollFirst()).append(" ");
        }

        System.out.println(sb);
    }
}
