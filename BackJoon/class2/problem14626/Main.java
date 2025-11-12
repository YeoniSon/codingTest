package BackJoon.class2.problem14626;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;
        int index = str.indexOf('*');

        for (int i = 0; i < 13; i++) {
            if (i == index) {
                continue;
            }
            if (i % 2 == 0) {
                sum += str.charAt(i) - '0';
            }else {
                sum += (str.charAt(i) - '0') * 3;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (index % 2 == 0) {
                if ((sum + i) % 10 == 0) {
                    System.out.println(i);
                    return;
                }
            }else {
                if ((sum + 3 * i) % 10 == 0) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
