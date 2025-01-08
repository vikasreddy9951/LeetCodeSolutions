package ArraysAndString;

public class ArraysFindingClosestNumber {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])<Math.abs(min) || nums[i]==Math.abs(min)){
                min=nums[i];
            }

        }
        return min;
    }
    public static void main(String[] args) {
        ArraysFindingClosestNumber solution = new ArraysFindingClosestNumber();
        int[] array={2,-1,1};
        System.out.println(solution.findClosestNumber(array));
    }
}
