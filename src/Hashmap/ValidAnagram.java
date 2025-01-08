package Hashmap;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hashMap= new HashMap<>();
        int lenS=s.length();
        int lenT=t.length();
        if(lenS==lenT){
            for(char c :t.toCharArray()){
                hashMap.put(c,hashMap.getOrDefault(c,0)+1);
            }
        }else{
            return false;
        }
        for(char c:s.toCharArray()){
            if(hashMap.containsKey(c)){
                int n=hashMap.get(c);
                if(n==0){
                    return false;
                }else{
                    hashMap.put(c,hashMap.getOrDefault(c,0)-1);
                }
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        ValidAnagram va= new ValidAnagram();
        System.out.println(va.isAnagram("aacc","ccac"));
    }
}
