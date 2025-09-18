package ArraysAndString;

import java.util.HashMap;
import java.util.Map;

public class FindMostFrequentVowelandConsonant {
    public int maxFreqSum(String s) {
        int result=0;
        HashMap<Character,Integer> map= new HashMap<>();
        String vowelsstr= "aeiou";

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int highestvowel=0;
        int highestconsonant=0;
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(vowelsstr.indexOf(entry.getKey())>0){
                highestvowel=Math.max(entry.getValue(),highestvowel);
            }else{
                highestconsonant=Math.max(entry.getValue(),highestconsonant);
            }
        }
        result=highestvowel+highestconsonant;
        return result;
    }
    public static void main(String[] args){
        FindMostFrequentVowelandConsonant obj = new FindMostFrequentVowelandConsonant();
        System.out.println(obj.maxFreqSum("successes"));
    }
}
