package ArraysAndString;

import java.util.Arrays;
import java.util.stream.Stream;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int len=strs.length-1;
        StringBuilder sb = new StringBuilder();
        int j=0;
        int i=0;
        int n=strs[0].length();
        if(strs.length>1){
            while(j<n) {
                if (strs[i].charAt(j) == strs[len].charAt(j)) {
                    sb.append(strs[i].charAt(j));
                    j++;
                }else{
                    return sb.toString();
                }
            }
        }else{
            if(strs.length==1){
                sb.append(strs[0]);
            }else if(strs.length==0){
                return "";
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        LongestCommonPrefix lcp= new LongestCommonPrefix();
        String[] strs={"ab", "a"};
        System.out.println(lcp.longestCommonPrefix(strs));
    }
}
