package Hashmap;

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char c:magazine.toCharArray()){
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        for(char c:ransomNote.toCharArray()){
            if(hashMap.containsKey(c)){
                hashMap.put(c, hashMap.getOrDefault(c,0)-1);
                if(hashMap.containsValue(0)) {
                    hashMap.remove(c);
                }
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        RansomNote ransomNote= new RansomNote();
        System.out.println(ransomNote.canConstruct("aab","baa"));
    }
}
