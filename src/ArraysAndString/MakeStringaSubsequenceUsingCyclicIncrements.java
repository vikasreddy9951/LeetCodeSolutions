package ArraysAndString;

public class MakeStringaSubsequenceUsingCyclicIncrements {
    public boolean canMakeSubsequence(String str1, String str2) {
        int len1=str1.length();
        int len2=str2.length();
        char str2char = str2.charAt(0);
        int i=0;
        int j=0;
        while(i<len1 && j<len2){
            char str1char=str1.charAt(i);
            if(str1char==str2char || (char)(str1char+1)==str2char ||
                    (str1char=='z' && str2char=='a')){
                j++;
                if(j<len2){
                    str2char=str2.charAt(j);
                }
            }i++;
        }
        return j==len2;
    }
    public static void main(String[] args){
        MakeStringaSubsequenceUsingCyclicIncrements mssuci=new MakeStringaSubsequenceUsingCyclicIncrements();
        String s1="abc";
        String s2="ad";
        System.out.println(mssuci.canMakeSubsequence(s1,s2));
    }
}
