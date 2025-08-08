package ArraysAndString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountEqualandDivisiblePairsinanArray {
    public int countPairs(int[] nums, int k) {
        int count=0;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int number=nums[i];
            if(!map.containsKey(number)){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(number).add(i);
        }
        for(Map.Entry<Integer,List<Integer>> entry: map.entrySet()){
            System.out.println(" KEY: " + entry.getKey()+ ", Indexes:--> "+ entry.getValue());
        }
        /*for(Map.Entry<Integer,List<Integer>> entry: map.entrySet()){
            if(entry.getValue().size()>1){
                int num=entry.getKey();
                for()
            }
        }*/

        return count;
    }
    public static void main(String[] args){
        CountEqualandDivisiblePairsinanArray ce= new CountEqualandDivisiblePairsinanArray();
        int[] nums={3,1,2,2,2,1,3};
        int k=2;
        ce.countPairs(nums, k);
    }
}
