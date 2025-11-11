package BackJoon.class2.problem30802;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int p = sc.nextInt();

        int tShirt = 0;
        int penBundle = 0;
        int pen = 0;

        for (int i = 0; i < arr.length; i++) {
           tShirt += arr[i] / t;
           if (arr[i] % t > 0) {
               tShirt++;
           }
        }
        System.out.println(tShirt);

        penBundle = n / p;
        pen = n % p;
        System.out.println(penBundle + " " + pen);
    }
}
