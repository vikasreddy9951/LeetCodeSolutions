package ArraysAndString;

import java.util.*;

public class FindScoreofanArrayAfterMarkingAllElements {
    public long findScore(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((i1, i2) -> {
            if (nums[i1] == nums[i2]) return i1 - i2;
            else {
                return nums[i1] - nums[i2];
            }
        });
        long result = 0;
        for (int i = 0; i < nums.length; i++) {
            pq.add(i);
        }
        boolean[] visited = new boolean[nums.length];
        while (!pq.isEmpty()) {
            int index = pq.poll();
            if (visited[index]) {
                continue;
            }
            result += nums[index];
            visited[index] = true;
            if (index > 0) {
                visited[index - 1] = true;
            }
            if (index < nums.length - 1) {
                visited[index + 1] = true;
            }
        }
        return result;
    }
    public static void main(String[] args){
        FindScoreofanArrayAfterMarkingAllElements fsoaaamae= new FindScoreofanArrayAfterMarkingAllElements();
        int[] nums={10,44,10,8,48,30,17,38,41,27,16,33,45,45,34,30,22,3,42,42};
        System.out.println(fsoaaamae.findScore(nums));
    }
}
