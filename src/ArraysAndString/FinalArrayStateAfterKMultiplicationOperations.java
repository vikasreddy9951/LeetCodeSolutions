package ArraysAndString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class FinalArrayStateAfterKMultiplicationOperations {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        ArrayList<int[]> arrayList = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });
        for (int i = 0; i < nums.length; i++) {
            pq.add(new int[]{nums[i], i});
        }
        for (int i = 0; i < k; i++) {
            int[] removed = pq.poll();
            int key = removed[0];
            int value = removed[1];
            pq.add(new int[]{key * multiplier, value});
        }
        int[] result = new int[nums.length];
        while (!pq.isEmpty()) {
            int[] polled = pq.poll();
            int val = polled[0];
            int ke = polled[1];
            result[ke] = val;
        }
        return result;
    }
    public static void main(String[] args){
        FinalArrayStateAfterKMultiplicationOperations fsakmo= new FinalArrayStateAfterKMultiplicationOperations();
        int[] arr={2,1,3,5,6};
        System.out.println(Arrays.toString(fsakmo.getFinalState(arr, 5, 2)));
    }
}
