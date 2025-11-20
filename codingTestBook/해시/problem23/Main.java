package codingTestBook.해시.problem23;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    private static int[] solution(String[] id_list, String[] report, int k) {
        // 신고당한 유저
        HashMap<String , HashSet<String>> reportedUser = new HashMap<>();
        // 처리 결과 메일 받은 유저 -> 받은 횟수 저장
        HashMap<String, Integer> cnt = new HashMap<>();

        for (String r : report) {
            String[] s = r.split(" ");
            String userId = s[0];
            String reportedId = s[1];

            if (!reportedUser.containsKey(reportedId)) {
                reportedUser.put(reportedId, new HashSet<>());
            }
            reportedUser.get(reportedId).add(userId);
        }

        for (Map.Entry<String, HashSet<String>> entry : reportedUser.entrySet()) {
            if (entry.getValue().size() >= k) {
                for(String uid : entry.getValue()) {
                    cnt.put(uid, cnt.getOrDefault(uid, 0) + 1);
                }
            }
        }

        int[] answer = new int[id_list.length];

        for (int i = 0; i < id_list.length; i++) {
            answer[i] = cnt.getOrDefault(id_list[i], 0);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] id1 = {"muzi", "frodo", "apeach", "neo"};
        String[] r1 = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        System.out.println(Arrays.toString(solution(id1, r1, 2)));

        String[] id2 = {"con", "ryan"};
        String[] r2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        System.out.println(Arrays.toString(solution(id2, r2, 3)));
    }
}
