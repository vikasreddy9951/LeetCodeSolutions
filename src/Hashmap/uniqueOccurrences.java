package Hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class uniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            set.add(entry.getValue());
        }
        if(set.size()!= map.size()){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        uniqueOccurrences uq= new uniqueOccurrences();
        int[] arr={-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uq.uniqueOccurrences(arr));
    }
}
