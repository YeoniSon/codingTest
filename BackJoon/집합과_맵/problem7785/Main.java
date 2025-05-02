package BackJoon.집합과_맵.problem7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            String value = st.nextToken();

            if (value.equals("enter")) {
                set.add(key);
            } else if (value.equals("leave")) {
                set.remove(key);
            }
        }

        //HashSet -> List
        ArrayList<String> list = new ArrayList<String>(set);

        Collections.sort(list, Collections.reverseOrder());

        for(String s:list){
            System.out.println(s);
        }

    }
}
