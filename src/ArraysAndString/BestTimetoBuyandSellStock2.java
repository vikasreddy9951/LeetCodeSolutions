package ArraysAndString;

import java.util.*;

public class BestTimetoBuyandSellStock2 {
    /*public int maxProfit(int[] prices) {
        int cheaper=prices[0];
        int indexforcheaper=0;
        int indexforfirsthighstock;
        int sellstock;
        int buystock;
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=1;i<prices.length;i++){
            if(cheaper>prices[i]){
                cheaper=prices[i];
                indexforcheaper=i;
            }
        }
        int profit=prices[indexforcheaper+1]-cheaper;
        list.add(profit);
        for(int i=indexforcheaper+2;i<prices.length;i++){
            if(profit<prices[i]){
                cheaper=prices[i];
                continue;
            }
            if(cheaper<prices[i]){
                profit=prices[i]-cheaper;
                list.add(profit);
            }
        }
        int ans=0;
        for(int i=0;i< list.size();i++){
            ans=ans+ list.get(i);
        }
        return ans;
    }*/
    /*public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }*/
    /*public int findLHS(int[] nums) {//1,2,2,2,3,3,7
        Arrays.sort(nums);
        int answer=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
            *//*if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }*//*
        }
        for(int i:nums){
            if(map.containsKey(i+1)){
                int max=map.get(i)+map.get(i+1);
                answer=Math.max(answer,max);
            }
        }
        return answer;*/
    /*public int possibleStringCount(String word) {
        int answer=1;
        *//*HashMap<Character,Integer> map = new HashMap<>();
        for(char c:word.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }*//*
        *//*for(Map.Entry<Character,Integer> entry: map.entrySet()){

        }*//*
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==word.charAt(i-1)){
                answer++;
            }
        }
        return answer;
    }*/
    public int[] maxSubsequence(int[] nums, int k) {
        int[] answer=new int[k];
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        List<Integer> list = new ArrayList<>();
        for(int i:nums){
            pq.add(i);
            list.add(i);
        }
        for(int i=0;i<nums.length-k;i++){
            list.remove(pq.poll());
        }
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
    public static void main(String[] args){
        int[] nums={3,4,3,3};
        /*String word="abbcccc";*/
        int target=2;
        BestTimetoBuyandSellStock2 bttbs2= new BestTimetoBuyandSellStock2();
        System.out.println(Arrays.toString(bttbs2.maxSubsequence(nums, target)));

    }
}
