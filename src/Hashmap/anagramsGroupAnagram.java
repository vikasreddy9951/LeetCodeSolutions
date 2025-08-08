package Hashmap;

import java.util.*;

public class anagramsGroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> result = new HashMap<>();
        for(String s: strs){
            char[] chararray=s.toCharArray();
            Arrays.sort(chararray);
            String string= new String(chararray);
            if(!result.containsKey(string)){
                result.put(string, new ArrayList<>());
            }
            result.get(string).add(s);
        }
        return new ArrayList<>(result.values());
    }
    public static void main(String[] args){
        anagramsGroupAnagram pro = new anagramsGroupAnagram();
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(pro.groupAnagrams(strs));
    }
}
