package RecursionAndBacktracingAll;

public class permutationsOfAString {
    public void permuteString(StringBuilder str,int index){
        if(index==str.length()-1){
            System.out.println(str);
        }
        for(int i=index;i<str.length();i++){
            swap(str,index,i);
            permuteString(str,index+1);
            swap(str,index,i);
        }
    }

    public void swap(StringBuilder str, int one, int two) {
        char temp = str.charAt(one);
        str.setCharAt(one, str.charAt(two));
        str.setCharAt(two, temp);
    }

    public static  void main(String[] args){
        permutationsOfAString per = new permutationsOfAString();
        String str="abc";
        int index=0;
        StringBuilder sb = new StringBuilder(str);
        per.permuteString(sb,index);
    }
}
