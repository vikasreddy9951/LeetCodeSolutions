package MatrixAndSudokoSolvers;

import java.util.ArrayList;
import java.util.Arrays;

public class matrixsRowAndColumns {
    /*public Boolean isFoundTarget(int[][] array , int target){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }*/
    /*public Boolean isFoundTarget(int[][] array, int target){
        int high = array.length-1;
        int low = 0;
        while(low<=high){
            int mid=(low+high)/2;
            if(array[low][mid]==target) return true;
            else if(target>array[low][mid]) low = mid+1;
            else high = mid-1;
        }
        return false;
    }*/
/*
    public  boolean binarySearch(ArrayList<Integer> nums, int target) {
        int n = nums.size(); //size of the array
        int low = 0, high = n - 1;

        // Perform the steps:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums.get(mid) == target) return true;
            else if (target > nums.get(mid)) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

    public boolean searchElement(ArrayList<ArrayList<Integer>> matrix, int target) {
        int n = matrix.size();
        int m = matrix.get(0).size();

        for (int i = 0; i < n; i++) {
            boolean flag = binarySearch(matrix.get(i), target);
            if (flag == true) return true;
        }
        return false;
    }*/
    public int maxSubArray(int[] array){
        //{2, 3, -8, 7, -1, 2, 3}
        int start = 0;
        int end = 0;
        int currentSum = array[0];
        int globalSum = array[0];
        for(int i=1;i<array.length;i++){
            if(currentSum+array[i]>array[i]){
                end=i;
            }
            if(array[i]>currentSum+array[i]){
                start=i;
            }
            currentSum=Math.max(array[i], currentSum+array[i]);
            globalSum=Math.max(globalSum, currentSum);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=start;i<=end;i++){
            list.add(array[i]);
        }
        System.out.println(Arrays.toString(list.toArray()));
        return globalSum;
    }
    public static void main(String[] args) {

        /*Product productA = ProductFactory.createProduct("A");
        productA.use();
        Product productB = ProductFactory.createProduct("B");
        productB.use();*/
        /*problems problems = new problems();
        String chars="][][][";
        System.out.println(problems.minSwaps(chars));*/
        /*problems problems = new problems();
        System.out.println(problems.swappings(98368));*/
        /*recursion rec = new recursion();
        String str="ABC";
        StringBuilder sb= new StringBuilder(str);
        rec.permute(sb,0);*/
        /*LinkedList ll = new LinkedList();
        int[] arr= {2,3,1,7,4,9,0,5};
        ll.Insertion(arr);
        ll.print();*/
        matrixsRowAndColumns mrc= new matrixsRowAndColumns();
        /*int[][] RandC={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        ArrayList<Integer> array= new ArrayList<>();
        array.add(new ArrayList<>(1,2,3));
        System.out.println(mrc.isFoundTarget(RandC,1));*/
        /*ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 4, 7, 11, 15)));
        matrix.add(new ArrayList<>(Arrays.asList(2, 5, 8, 12, 19)));
        matrix.add(new ArrayList<>(Arrays.asList(3, 6, 9, 16, 22)));
        matrix.add(new ArrayList<>(Arrays.asList(10, 13, 14, 17, 24)));
        matrix.add(new ArrayList<>(Arrays.asList(18, 21, 23, 26, 30)));

        boolean result = mrc.searchElement(matrix, 900);
        System.out.println(result ? "true" : "false");*/
        /*int[] list={2, 3, -8, 7, -1, 2, 3};
         *//*ArrayList<Integer> list = new ArrayList<>();
        //2, 3, -8, 7, -1, 2, 3
        //5, 4, 1, 7, 8
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(7);
        list.add(8);*//*
        System.out.println(mrc.maxSubArray(list));*/
       /* solution sol= new solution();
        int[] arr={2,4,9,3};
        System.out.println(Arrays.toString(sol.decrypt(arr, -2)));*/

    }
}
