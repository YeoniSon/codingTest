package codingTestBook.배열.problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        System.out.println(Arrays.toString(set.stream().sorted().mapToInt(Integer::intValue).toArray()));
    }
}
