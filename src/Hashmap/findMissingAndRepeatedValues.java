package Hashmap;

import java.util.*;

public class findMissingAndRepeatedValues {
    /*public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new HashSet<>();
        int[] result= new int[2];
        int n= grid.length;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (set.contains(grid[i][j])) {
                    result[0] = grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        for(int i=1;i<=n*n;i++){
            if(!set.contains(i)){
                result[1]=i;
                break;
            }
        }
        return result;
    }*/
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isprime(i)){
                list.add(i);
            }
        }
        int[] result=new int[2];

        if(list.size()>1){
            int[] arr=new int[list.size()-1];
            for(int i=0;i<list.size()-1;i++){
                arr[i]=list.get(i+1)-list.get(i);
            }
            int lowestindex=0;
            int lowvalue=arr[0];
            for(int i=1;i< arr.length;i++){
                if(arr[i]<lowvalue){
                    lowvalue=arr[i];
                    lowestindex=i;
                }
            }
            result[0]=list.get(lowestindex);
            result[1]=list.get(lowestindex+1);
        }
        else {
            result[0]=-1;
            result[1]=-1;
        }
        return result;
    }

    public boolean isprime(int number){
        if(number<=1){
            return false;
        }
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        findMissingAndRepeatedValues fv= new findMissingAndRepeatedValues();
        System.out.println(Arrays.toString(fv.closestPrimes(84084,407043)));
    }
}
