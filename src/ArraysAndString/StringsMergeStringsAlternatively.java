package ArraysAndString;

public class StringsMergeStringsAlternatively {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n=word1.length()+word2.length();
        int var1=0;
        int var2=0;
        for(int i=0;i<n;i++){
            if(var1!=word1.length()){
                sb.append(word1.charAt(var1));
                var1++;
            }
            if(var2!=word2.length()){
                sb.append(word2.charAt(var2));
                var2++;
            }
            if(var1==word1.length() && sb.length()!=n){
                sb.append(word2.substring(var2,word2.length()));
                break;
            }
            if(var2==word2.length() && sb.length()!=n){
                sb.append(word1.substring(var1,word1.length()));
                break;
            }
        }
        return sb.toString();
    }

    public static void  main(String[] args){
        StringsMergeStringsAlternatively smsa= new StringsMergeStringsAlternatively();
        String a="abcd";
        String b="pq";
        System.out.println(smsa.mergeAlternately(a,b));
    }
}
