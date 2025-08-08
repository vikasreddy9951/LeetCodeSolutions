package ArraysAndString;

import java.util.*;

public class WordSubsets {
    /*public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<words1.length;i++){
            int count=0;
            for(int j=0;j<words2.length;j++){
                for(int k=0;k<words2[j].length();k++){
                    String s= String.valueOf(words2[j].charAt(k));
                    if(words1[i].contains(s)){
                        count++;
                    }else{
                        break;
                    }
                }
            }
            if(count==words2.length){
                list.add(words1[i]);
            }
        }
        return list;
    }*/
    /*public boolean canConstruct(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int count=0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            int num=entry.getValue();
            if(num%2==1){
                count++;
            }
        }
        if(count>k || s.length()<k){
            return false;
        }
        return true;
    }*/
    /*public int minimumLength(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        char[] chars= s.toCharArray();
        for(char c : chars){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int result=0;
        for(Map.Entry<Character,Integer> entry : hm.entrySet()) {
            if(entry.getValue()%2==1){
                result+=1;
            }else{
                result+=2;
            }
        }
        return result;
    }*/
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] frequency=new int[A.length+1];
        int[] result= new int[A.length];
        int count=0;
        for(int i=0;i<A.length;i++){
            frequency[A[i]]++;
            if(frequency[A[i]]==2){
                count++;
            }
            frequency[B[i]]++;
            if(frequency[B[i]]==2){
                count++;
            }
            result[i]=count;
        }
        return result;
    }
    public static void main(String[] args){
        /*WordSubsets ws = new WordSubsets();
        String[] str1={"amazon","apple","facebook","google","leetcode"};
        String[] str2={"lo","eo"};
        System.out.println(ws.wordSubsets(str1,str2));*/
        /*WordSubsets ws = new WordSubsets();
        System.out.println(ws.canConstruct("madam",5));*/

        WordSubsets ws = new WordSubsets();
        int[] arr1={1,3,2,4};
        int[] arr2={3,1,2,4};
        System.out.println(Arrays.toString(ws.findThePrefixCommonArray(arr1, arr2)));
    }
}