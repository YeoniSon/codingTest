package BackJoon.class2.problem28702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        String num1 = br.readLine();
        String num2 = br.readLine();
        String num3 = br.readLine();

        if (isNumber(num1)) {
            num = Integer.parseInt(num1)+ 3;
        }else {
            if (isNumber(num2)) {
                num = Integer.parseInt(num2)+2;
            }else {
                if (isNumber(num3)) {
                    num = Integer.parseInt(num3)+1;
                }
            }
        }

        System.out.println(getFizzBuzz(num));
    }
    static boolean isNumber(String s) {
        return s.matches("[+-]?\\d*(\\.\\d+)?");
    }
    static String getFizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        }else if (num % 5 == 0) {
            return "Buzz";
        }else {
            return String.valueOf(num);
        }
    }
}
