package ArraysAndString;

import java.util.*;
import java.util.stream.Stream;

public class learnstreams {
    /*public static void java8(){
        *//*int[] array={3,2,6,8,3,1,90,21,21,4,3,6,44,37,88};
        List<Integer> list= Arrays.asList(1,2,3);
*//**//*
        {3,2,6,8,3,1,90,21,21,4,3,6,44,37,88};
*//**//*
        Stream<Integer> li=list.stream();
        int sum=li.sorted()
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);*/
    /*public List<String> stringMatching(String[] words) {

        *//*Stack<String> stack= new Stack<>();
        for(int i=0;i<words.length;i++){
            stack.push(words[i]);
        }*//*
        Set<String> list = new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(j==i){
                    continue;
                }else{
                    if(words[i].contains(words[j])){
                            list.add(words[j]);
                        }

                    *//*String st=words[i];
                    if(st.contains(stack.get(j))){
                        list.add(stack.get(j));
                    }*//*
                }
            }
        }
        return list.stream().toList();
    }*/
    public int countPrefixSuffixPairs(String[] words) {
        List<List<String>> list = new ArrayList<>();
        int count=0;
        for(int i=0;i<words.length;i++){
            String s1=words[i];
            for(int j=i+1;j<words.length;j++){
                String s2=words[j];
                if(s2.startsWith(s1) && s2.endsWith(s1)){
                    list.add(Arrays.asList(s1,s2));
                    count++;
                }

               /* if(i==j){
                    continue;
                }
               *//* if(PrefixAndSuffix(words[i],words[j])){
                    list.add(Arrays.asList(words[i],words[j]));
                }*/
            }
        }
        return list.size();
    }
  /*  *//*public boolean PrefixAndSuffix(String s1,String s2){
        int i=0;
        for(int j=0;j<s1.length();j++){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
            }else{
                return false;
            }
        }
        int k=s1.length()-1;
        int n=s2.length()-1;
        for(int j=0;j<s1.length();j++){
            if(s1.charAt(k)==s2.charAt(n)){
                k--;
                n--;
            }else{
                return false;
            }
        }*//*

        *//*for(int j=s2.length()-1;j>=s1.length();j--){
            if(s1.charAt(k)==s2.charAt(j)){
                k--;
            }else{
                return false;
            }
        }*//*
        return true;
    }*/
    public static void main(String[] args){
        learnstreams ls= new learnstreams();
        String[] arr={"pa","papa","ma","mama"};
        System.out.println(ls.countPrefixSuffixPairs(arr));
    }
}
