package SWEA.D2.problem1945;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc < T+1; tc++) {
            int n = sc.nextInt();
            int[] num = new int[5];

            while(n != 1){
                if (n % 2 == 0) {
                    num[0]++;
                    n /= 2;
                } else if (n % 3 == 0) {
                    num[1]++;
                    n /= 3;
                } else if (n % 5 == 0){
                    num[2]++;
                    n /= 5;
                } else if (n % 7 == 0) {
                    num[3]++;
                    n /= 7;
                }else if (n % 11 == 0){
                    num[4]++;
                    n /= 11;
                }
            }

            System.out.printf("#%d ", tc);
            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i]+ " ");
            }
            System.out.println();
        }
    }
}
