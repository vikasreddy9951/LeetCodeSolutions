package ArraysAndString;

public class MaximumScoreAfterSplittingaString {
    public int maxScore(String s) {
        int maxcount=0;
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                right++;
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                left++;
            }else{
                right--;
            }
            maxcount=Math.max(maxcount,left+right);
        }
        return maxcount;
    }
    public void backtracing(int n,int start){
        if(n<start){
            return;
        }
        backtracing(n,start+1);
        System.out.println(start);
    }
    public static void main(String[] args){
        MaximumScoreAfterSplittingaString msasas= new MaximumScoreAfterSplittingaString();
        /*System.out.println(msasas.maxScore("011101"));*/
        msasas.backtracing(3,1);
    }
}
