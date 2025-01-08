package Hashmap;

import java.util.HashMap;

public class HashmapnumJewelsInStones {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char c:jewels.toCharArray()){
            hashmap.put(c,1);
        }
        int answer=0;
        for(int i=0;i<stones.length();i++){
            if(hashmap.containsKey(stones.charAt(i))){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        HashmapnumJewelsInStones hmnjs=new HashmapnumJewelsInStones();
        System.out.println(hmnjs.numJewelsInStones("aA","aAAbbbb"));
    }
}
