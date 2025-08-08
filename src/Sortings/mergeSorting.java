package Sortings;

import java.util.ArrayList;

public class mergeSorting {
    public void mergesort(int[] arr, int low, int high) {
        if (low==high) {
            return;
        }
        int mid = (low + high) / 2;
        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> list = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }
        while (right <= high) {
            list.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }
    }
    public static void main(String[] args) {
        mergeSorting ss = new mergeSorting();
        int[] arr = {5, 2, 1, 6, 3};
        int n = arr.length - 1;
        System.out.println("before sorting");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        ss.mergesort(arr, 0, n);

        System.out.println("after sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}