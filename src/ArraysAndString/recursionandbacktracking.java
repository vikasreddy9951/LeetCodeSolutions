package ArraysAndString;

import java.util.ArrayList;

public class recursionandbacktracking {
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
    public void combinationSum(int index, int[] arr, ArrayList<Integer> list,int target) {
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
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        recursionandbacktracking recursion = new recursionandbacktracking();
        int target=3;
        recursion.combinationSum(0,arr,list,target);
    }
}
