package ArraysAndString;

import java.util.Arrays;

public class MovePiecestoObtainaString {
    public boolean canChange(String start, String target) {
        int i=0;
        int j=0;
        char[] char1=start.toCharArray();
        char[] char2=target.toCharArray();
        int n=start.length();

        while(i<n || j<n){
            while(i < n && char1[i] == '_')
                i++;
            while(j<n && char2[j]=='_')
                j++;

            if(i==n ||j==n){
                break;
            }
            if(char1[i]!=char2[j]){
                return false;
            }
            if(char1[i]=='L' && i<j){
                return false;
            }
            if(char1[i]=='R' && j<i){
                return false;
            }
            i++;
            j++;
        }
        return i==n && j==n;
    }
    public void swap(char[] chararray,int swap1,int swap2){
        char c=chararray[swap1];
        chararray[swap1]=chararray[swap2];
        chararray[swap2]=c;
    }
    public static void main(String[] args){
        MovePiecestoObtainaString mptos= new MovePiecestoObtainaString();
        String s1="_L__R__R_";
        String s2="L______RR";
        System.out.println(mptos.canChange(s1,s2));
    }
}
