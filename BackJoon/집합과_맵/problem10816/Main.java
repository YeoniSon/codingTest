package BackJoon.집합과_맵.problem10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        /* 상근이가 가지고 있는 숫자카드
        * HashMap<Key, Value>를 사용
        * Key = 입력되는 원소
        * Value = 원소의 개수(= 중복 입력 된 원소의 수)
        */
        HashMap<Integer, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(st.nextToken());

            /*
             * getOrDefault(key, defaultValue)
             * key에 대해 map에 저장 된 value를 반환
             * 만약 value가 없을 경우 defaultValue 반환
             */

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());

            sb.append(map.getOrDefault(key, 0)).append(" ");
        }

        System.out.println(sb.toString());
    }
}
