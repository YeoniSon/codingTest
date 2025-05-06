package BackJoon.집합과_맵.problem1269;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n, m;
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <n; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <m; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> A_B = new HashSet<>(A);
        HashSet<Integer> B_A = new HashSet<>(B);

        // 차집합
        A_B.removeAll(B);
        B_A.removeAll(A);


        //합집합
        A_B.addAll(B_A);


        //원소의 개수
        System.out.println(A_B.size());
    }
}
