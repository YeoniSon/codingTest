package BackJoon.심화1.problem2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int len = s.length();
        int cnt = 0;

        for (int i = 0; i < len; i++) {

            char c = s.charAt(i);

            if (c == 'c' && i < len - 1) {
                // 다음 문자가 = / - 인지를 구분
                if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
                    i++;
                }
            }
            else if (c == 'd' && i < len - 1) {
                if (s.charAt(i + 1) == '-') {
                    i++;
                } else if (s.charAt(i + 1) == 'z' && i < len - 2) {
                    if (s.charAt(i + 2) == '=') {
                        i += 2;
                    }
                }
            } else if ((c == 'l' || c == 'n')&& i < len - 1) {
                if (s.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if ((c == 's' || c == 'z') && i < len - 1) {
                if (s.charAt(i + 1) == '='){
                    i++;
                }
            }

            cnt++;
        }

        System.out.println(cnt);

    }
}
