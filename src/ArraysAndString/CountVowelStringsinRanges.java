package ArraysAndString;

import java.util.Arrays;

public class CountVowelStringsinRanges {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] newArray= new int[queries.length];
        int[] prefix= new int[words.length+1];
        int prefixindex=1;
        for(int i=0;i<=words.length-1;i++){
            String string = words[i];
            if((string.charAt(0)=='a' || string.charAt(0)=='e' ||
                    string.charAt(0)=='i' || string.charAt(0)=='o' ||
                    string.charAt(0)=='u') && (string.charAt(string.length()-1)=='a' ||
                    string.charAt(string.length()-1)=='e' ||
                    string.charAt(string.length()-1)=='i' ||
                    string.charAt(string.length()-1)=='o' ||
                    string.charAt(string.length()-1)=='u')){
                prefix[prefixindex]= prefix[prefixindex-1]+1;
            }else{
                prefix[prefixindex]=prefix[prefixindex-1];
            }
            prefixindex++;
        }
        for(int i=0;i< queries.length;i++){
            newArray[i]=prefix[queries[i][1]+1]-prefix[queries[i][0]];
        }
        return newArray;
    }

    public static void main(String[] args){
        CountVowelStringsinRanges cvsir= new CountVowelStringsinRanges();
        String[] words={"aba","bcb","ece","aa","e"};
        int[][] queries={{0,2},{1,4},{1,1}};
        System.out.println(Arrays.toString(cvsir.vowelStrings(words, queries)));
    }
}

/*int[] newArray= new int[queries.length];
int[] counter= new int[words.length];
        for(int i=0;i<=words.length-1;i++){
String string = words[i];
            if((string.charAt(0)=='a' || string.charAt(0)=='e' ||
        string.charAt(0)=='i' || string.charAt(0)=='o' ||
        string.charAt(0)=='u') && (string.charAt(string.length()-1)=='a' ||
        string.charAt(string.length()-1)=='e' ||
        string.charAt(string.length()-1)=='i' ||
        string.charAt(string.length()-1)=='o' ||
        string.charAt(string.length()-1)=='u')){
counter[i]=1;
        }else{
counter[i]=0;
        }
        }
        for(int i=0;i<=queries.length-1;i++){
int count=0;
int start=queries[i][0];
int end=queries[i][1];
            for(int j=start;j<=end;j++){
        if(counter[j]==1){
count++;
        }
        }
newArray[i]=count;
        }
                return newArray;*/
