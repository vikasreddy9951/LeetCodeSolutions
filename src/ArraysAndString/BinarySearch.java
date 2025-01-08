package ArraysAndString;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int high=nums.length-1;
        int low=0;
        int mid=(high+low)/2;
        while(low<=high){
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                low=mid+1;
                mid=(low+high)/2;
            }else if(nums[mid]>target){
                high=mid-1;
                mid=(high+low)/2;
            }
        }
        return -1;
    }
    public static int searchInsert(int[] nums, int target) {
        int high=nums.length-1;
        int low=0;
        while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    public static void rotate(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j< matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }
    }
    public static void main(String[] args){
        /*int[] arr={1,3,5,6};
        System.out.println(searchInsert(arr,2));*/
        int[][] matrix ={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.print(" ");
        }
    }
}
