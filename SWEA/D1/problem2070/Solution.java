package SWEA.D1.problem2070;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            int a,b;
            st= new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if (a > b){
                System.out.printf("#%d >\n",i);
            }else if(a < b){
                System.out.printf("#%d <\n",i);
            }else {
                System.out.printf("#%d = \n",i);
            }
        }
    }
}
