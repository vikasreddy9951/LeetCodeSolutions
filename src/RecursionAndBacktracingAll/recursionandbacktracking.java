package RecursionAndBacktracingAll;

import java.util.ArrayList;
import java.util.List;

public class recursionandbacktracking {
    //problems on recuring and backing for an array or String etc...,
    /*public static void recursions(int index, int[] arr,ArrayList<Integer> list){
        int n= arr.length;
        if(index>=n){
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        recursions(index+1,arr,list);
        list.removeLast();
        recursions(index+1,arr,list);
    }*/
    /*public boolean recrsionsofsubsequences(int index, int[] arr,ArrayList<Integer> list,
                                               int sum, int k,int n){
        if(index==n){
            if(sum==k){
                System.out.println(list);
                return true;
            }else{
                return false;
            }
        }
        list.add(arr[index]);
        sum=sum+arr[index];
        if(recrsionsofsubsequences(index+1,arr,list,sum,k,n)==true){
            return true;
        }
        sum=sum-arr[index];
        list.removeLast();

        if(recrsionsofsubsequences(index+1,arr,list,sum,k,n)==true){
            return true;
        }
        return false;
    }*/
    /*public void combinationSum(int index, int[] arr, ArrayList<Integer> list,int target) {
        if (index == arr.length) {
            if (target == 0) {
                System.out.println(list.toString());
            }
            return;
        }
        if (arr[index] <= target) {
            list.add(arr[index]);
            combinationSum(index, arr, list,target - arr[index]);
            list.removeLast();
        }
        combinationSum(index + 1, arr, list, target);
    }*/
    public void combinationsum(int index, int[] array,ArrayList<Integer> list, int target){
        if(index==array.length){
            if(target==0){
                System.out.println(list);
            }
            return;
        }
        if(array[index]<=target){
            list.add(array[index]);
            combinationsum(index,array,list,target-array[index]);
            list.remove(list.size()-1);
        }
        combinationsum(index+1,array,list,target);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target=7;
        ArrayList<Integer> list = new ArrayList<>();
        List<List<Integer>> answer= new ArrayList<>();
        recursionandbacktracking recursion = new recursionandbacktracking();
        recursion.combinationsum(0,arr,list,target);
    }
}