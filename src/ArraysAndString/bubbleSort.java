package ArraysAndString;

import java.util.ArrayList;
import java.util.Arrays;

public class bubbleSort {
    /*public int[] bubbleSortingAlgo(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
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
    }*/
    /*public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        int n = temperatures.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int temperature : temperatures) {
            list.add(temperature);
        }
        int i=0;
        int j=0;
        while(i<temperatures.length-1){
            if(i==temperatures.length-1){
                answer[i]=0;
            }
            int count=0;
            int current=list.remove(j);
            if(current< list.get(j)){
                count++;
                answer[i]=count;
                i++;
            }else{
                int loop=0;
                while(loop<list.size()){
                    if(current<list.get(loop)){
                        answer[i]=count;
                        i++;
                    }else{
                        count++;
                        loop++;
                    }
                }
            }
        }
        return answer;
        }*/

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
        bubbleSort bs= new bubbleSort();
        int[] arr= {5,4,3,2,1};
        /*System.out.println(Arrays.toString(bs.dailyTemperatures(arr)));*/
        System.out.println(Arrays.toString(bs.insertionsort(arr)));
    }
}
