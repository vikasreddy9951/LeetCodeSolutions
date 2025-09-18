package ArraysAndString;

public class ReverseInteger {
    public int reverse(int x) {
        int result=0;
        int startofx=x;
        StringBuilder sb = new StringBuilder();
        if(x==0){
            return 0;
        }
        while(x!=0){
            int mod = x%10;
            if(mod<0){
                mod=Math.abs(mod);
            }
            sb.append(mod);
            x=x/10;
        }
        String str=sb.toString();
        try{
            result=Integer.valueOf(str);
        }catch(Exception e){
            return 0;
        }

        if(startofx<0){
            result=-result;
        }
        return result;
    }

    public static void main(String[] args){
        ReverseInteger r= new ReverseInteger();
        System.out.println(r.reverse(1534236469));
    }
}
