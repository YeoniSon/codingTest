package BackJoon.집합과_맵.problem1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n,m;
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // 2가지 버전
        // 숫자로 검색시
        HashMap<Integer, String> map1 = new HashMap<>();
        // 문자로 검색시
        HashMap<String, Integer> map2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            map1.put(i+1,name);
            map2.put(name, i+1);
        }

        for (int i = 0; i < m; i++) {
            String s = br.readLine();

            if (isNumber(s)) {
                System.out.println(map1.get(Integer.parseInt(s)));
            }else {
                System.out.println(map2.get(s));
            }
        }
    }

    // 입력값이 숫자인지 아닌지 확인
    static boolean isNumber(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
