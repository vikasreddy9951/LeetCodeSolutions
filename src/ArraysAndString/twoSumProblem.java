package ArraysAndString;

public class twoSumProblem {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length-1;//3
        return sum(0,n,numbers,target);
    }
    public int[] sum(int i,int j, int[] numbers, int target){
        int[] arr=new int[2];
        int res=numbers[i]+numbers[j];
        if(res==target){
            arr[0]=i+1;
            arr[1]=j+1;
            return arr;
        }
        else if(res>target){
            arr=sum(i,j-1,numbers,target);
        }
        else {
            arr=sum(i+1,j,numbers,target);
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr={2,7,11,15};
        int target=9;
        twoSumProblem comb = new twoSumProblem();
        comb.twoSum(arr,target);
    }
}
