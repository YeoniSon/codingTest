package BackJoon.class2.problem2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        sb.append(avg(arr)).append("\n");
        sb.append(middleNum(arr)).append("\n");
        sb.append(frequence(arr)).append("\n");
        sb.append(range(arr)).append("\n");
        System.out.println(sb);
    }
    static int avg (int[] arr) {
        int sum = Arrays.stream(arr).sum();
        return (int) Math.round((float) sum / arr.length);
    }
    static int middleNum(int[] arr) {
        int mid = arr.length / 2;
        return arr[mid];
    }
    static int frequence(int[] arr) {
        int[] cnt = new int[8001];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt[arr[i] + 4000]++;
            max = Math.max(cnt[arr[i] + 4000], max);
        }
        ArrayList<Integer> max_idx = new ArrayList<>();
        for (int i = 0; i <= 8000; i++) {
            if (max == cnt[i]) {
                max_idx.add(i-4000);
            }
        }
            return max_idx.size() > 1 ? max_idx.get(1) : max_idx.get(0);
    }

    static int range(int[] arr) {
        return arr[arr.length-1] - arr[0];
    }
}
