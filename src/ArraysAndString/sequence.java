package ArraysAndString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sequence {
    /*public void subsequence(int index, ArrayList<Integer> list, int[] arr){
        if(index==arr.length){
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        subsequence(index+1,list,arr);
        list.removeLast();
        subsequence(index+1,list,arr);
    }*/
    /*public void printsubsequencesofsumk(int index,ArrayList<Integer> list,
                                           int[] arr,int sum,int k){
        if(index>=arr.length){
            if(sum==k) {
                System.out.println(list);
            }
            return;
        }
        list.add(arr[index]);
        sum=sum+arr[index];
        printsubsequencesofsumk(index+1,list,arr,sum,k);
        list.removeLast();
        sum=sum-arr[index];

        printsubsequencesofsumk(index+1,list,arr,sum,k);
    }*/
    /*public void combinationsum(int index,int[] arr,ArrayList<Integer> list,int target){
        if(index==arr.length){
            if(target==0){
                System.out.println(list);
            }
            return;
        }

        if(arr[index]<=target){
            list.add(arr[index]);
            combinationsum(index,arr,list,target-arr[index]);
            list.removeLast();
        }
        combinationsum(index+1,arr,list,target);
    }*/
    /*public void permutations(ArrayList<Character> list, char[] characters){
        if(list.size()==characters.length){
            StringBuilder sb = new StringBuilder();
            for(char c:list){
                sb.append(c);
            }
            System.out.println(sb);
            return;
        }

        for(char c:characters){
            if(list.contains(c)){
                continue;
            }
            list.add(c);
            permutations(list,characters);
            list.removeLast();
        }
    }*/
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set= new HashSet<>();
        int count=0;
        set.add(s.charAt(0));
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1) && !(set.contains(s.charAt(i)))){
                set.add(s.charAt(i));
                count=Math.max(count,set.size());

            }else{
                set.clear();
                set.add(s.charAt(i));
            }
        }
        if(!set.contains(s.charAt(s.length()-1))){
            set.add(s.charAt(s.length()-1));
        }
        return count;
    }
    public static void main(String[] args){
        sequence sq= new sequence();
        String string ="ABC";
        char[] characters=string.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        List<List<Character>> result= new ArrayList<>();
        System.out.println(sq.lengthOfLongestSubstring("pwwekew"));//length=7
    }
}
