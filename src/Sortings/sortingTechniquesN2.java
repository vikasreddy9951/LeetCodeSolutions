package Sortings;

import java.util.Arrays;

public class sortingTechniquesN2 {
    public int[] bubbleSortingAlgo(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public int[] selectionSorting(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        return arr;
    }
    public int[] insertionsort(int[] arr) {
        for(int i=0;i< arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        sortingTechniquesN2 bs= new sortingTechniquesN2();
        int[] arr= {5,4,3,2,1};
        System.out.println(Arrays.toString(bs.bubbleSortingAlgo(arr)));
    }
}
