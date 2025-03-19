package BackJoon.심화1.problem1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (checkStr(br.readLine())){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    static boolean checkStr(String str){
        boolean[] checkAlpha = new boolean[26];
        int prev = -1;

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (prev != now) {
                if (!checkAlpha[now - 'a']) {
                    checkAlpha[now - 'a'] = true;
                    prev = now;
                }else {
                    return false;
                }
            }else {
                continue;
            }
        }
        return true;
    }
}
