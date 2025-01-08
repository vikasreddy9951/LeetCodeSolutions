package ArraysAndString;

import java.util.*;

public class FindScoreofanArrayAfterMarkingAllElements {
    public long findScore(int[] nums) {
    PriorityQueue<Integer> pq= new PriorityQueue<>((i1,i2)->{
        if(nums[i1]==nums[i2]) return i1-i2;
        else{
            return nums[i1]-nums[i2];
        }
    });
    long result=0;
    for(int i=0;i<nums.length;i++){
        pq.add(i);
    }
    boolean[] visited= new boolean[nums.length];
    while(!pq.isEmpty()){
        int index=pq.poll();
        if(visited[index]) {
            continue;
        }
        result+=nums[index];
        visited[index]=true;
        if(index>0){
            visited[index-1]=true;
        }
        if(index<nums.length-1){
            visited[index+1]=true;
        }
    }
    return result;
    }

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        ArrayList<int[]> arrayList= new ArrayList<>();
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)-> {
            if(a[0]==b[0]){
                return a[1]-b[1];
            }else {
                return Integer.compare(a[0],b[0]);
            }
        });
        for(int i=0;i<nums.length;i++){
            pq.add(new int[]{nums[i],i});
        }
        for(int i=0;i<k;i++){
            int[] removed=pq.poll();
            int key=removed[0];
            int value=removed[1];
            pq.add(new int[]{key*multiplier,value});
        }
        int[] result = new int[nums.length];
        while(!pq.isEmpty()){
            int[] polled=pq.poll();
            int val=polled[0];
            int ke=polled[1];
            result[ke]=val;
        }
        return result;
    }
    public static void main(String[] args){
        FindScoreofanArrayAfterMarkingAllElements fsoaaamae= new FindScoreofanArrayAfterMarkingAllElements();
        /*int[] nums={10,44,10,8,48,30,17,38,41,27,16,33,45,45,34,30,22,3,42,42};
        System.out.println(fsoaaamae.findScore(nums));*/
        int[] arr={2,1,3,5,6};
        System.out.println(Arrays.toString(fsoaaamae.getFinalState(arr, 5, 2)));
    }
}
