package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int mid=nums.length/2;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>mid){
                return entry.getKey();
            }
        }
        return 0;
    }
    public static void main(String[] args){
        MajorityElement me = new MajorityElement();
        int[] nums={3,2,3};
        System.out.println(me.majorityElement(nums));
    }
}
