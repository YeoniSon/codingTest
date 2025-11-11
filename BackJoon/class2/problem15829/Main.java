package BackJoon.class2.problem15829;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String a = scan.next();

        long pow=1, sum = 0;
        int m = 1234567891;

        for (int i = 0; i < size; i++) {
            char ascii = a.charAt(i);
            int num = (int) ascii - 96;
            sum += (num * pow) % m;
            pow= 31*pow % m;
        }
        System.out.print(sum%m);
    }
}
