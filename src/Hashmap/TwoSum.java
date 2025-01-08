package Hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] answer= new int[2];
        HashMap<Integer,Integer> hashMap= new HashMap<>();

        for(int i=0;i< nums.length;i++){
            int find=target-nums[i];
            if(hashMap.containsKey(find)){
                answer[0]=i;
                answer[1]=hashMap.get(find);
                return answer;
            }
            hashMap.put(nums[i],i);
        }
        return answer;
    }
    public static void main(String[] args){
        TwoSum ts= new TwoSum();
        int[] nums={2,7,11,15};
        System.out.println(Arrays.toString(ts.twoSum(nums, 9)));
    }
}
