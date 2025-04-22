package BackJoon.일반수학1.problem1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int cross = 1; int prev = 0;
        while(true){
            if (x <= prev + cross) {
                if (cross % 2 == 1) {
                    System.out.print((cross - (x - prev - 1)) + "/" + (x - prev));
                    break;
                }
                else {
                    System.out.print((x - prev) + "/" + (cross - (x - prev-1)));
                    break;
                }
            }else {
                prev += cross;
                cross++;
            }
        }


    }
}
