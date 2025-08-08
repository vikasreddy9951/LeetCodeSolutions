package AllAndExtras;

public class decurptSolutions {
    /*public int[] decrypt(int[] code, int k) {//2,4,9,3
        int n=code.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            if(k>0){
                for(int j=i+1;j<i+1+k;j++){
                    res[i]+=code[j%n];
                }
            }
            if(k<0){
                for(int j=-1;j>=k;j--){
                    int index=(i+j)%n;
                    if(index<0){
                        index=index+n;
                    }
                    res[i]+=code[index];
                }
            }
        }
        return res;
    }*/
    public void calculate(int[] res,int k,int[] prefix){
        int n=res.length;
        if(k>0){
            for(int i=0;i<n;i++){
                res[i]=prefix[i+k]-prefix[i];
            }
        }else{
            k=Math.abs(k);
            for(int i=n;i<2*n;i++){
                res[i-n]=prefix[i-1]-prefix[i-k-1];
            }
        }
    }
    public int[] decrypt(int[] code, int k) {//2,4,9,3
        int n=code.length;
        int[] res= new int[n];
        if(k==0){
            return new int[n];
        }

        int[] prefix=new int[2*n];
        prefix[0]=code[0];
        for(int i=1;i<2*n;i++){
            prefix[i]=prefix[i-1]+code[i%n];
            calculate(res,k,prefix);
        }
        return res;
    }
}
