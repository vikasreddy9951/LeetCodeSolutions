package ArraysAndString;

import java.util.Arrays;

public class ArraysProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] left=new int[nums.length];
        int[] right= new int[nums.length];
        int leftproduct=1;
        int rightproduct=1;
        int j=1;
        int loop=nums.length-1;
        for(int i=0;i< nums.length;i++){
            j=loop-i;
            if(i>=1){
                left[i]=leftproduct*nums[i-1];
                leftproduct=leftproduct*nums[i-1];
            }else{
                left[i]=leftproduct;
            }if(j==nums.length-1){
                right[j]=rightproduct;
            }else {
                right[j] = rightproduct * nums[j + 1];
                rightproduct = rightproduct * nums[j + 1];
            }
        }
        int[] answer=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            answer[i]=left[i]*right[i];
        }
        return answer;
    }
    public static void main(String[] args){
        ArraysProductExceptSelf apes= new ArraysProductExceptSelf();
        int[] nums={-1,1,0,-3,3};
        System.out.println(Arrays.toString(apes.productExceptSelf(nums)));
    }
}
