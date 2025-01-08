package TwoPointers;

import java.util.Arrays;

public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        int head=0;
        int tail=nums.length-1;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        for(int i=tail;i>=0;i--){
            if(nums[head]>nums[tail]){
                result[i]=nums[head];
                head++;
            }else{
                result[i]=nums[tail];
                tail--;
            }
        }
        return result;
    }
    public static void main(String[] args){
        SquaresofaSortedArray sosa = new SquaresofaSortedArray();
        int[] nums={-7,-3,2,3,11};
        System.out.println(Arrays.toString(sosa.sortedSquares(nums)));
    }
}
