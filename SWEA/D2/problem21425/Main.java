package SWEA.D2.problem21425;

import java.util.Scanner;

public class Main {
    static int a, b, n;
    static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t < T + 1; t++) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            cnt = 0;

            if (a > b) {
                dfs(a,b);
            }else {
                dfs(b,a);
            }
            System.out.println(cnt);
        }
    }

    public static void dfs(int x, int y){
        int sum = x + y;
        cnt++;
        if (sum > n) {
            return;
        }
        dfs(sum, x);
    }
}
