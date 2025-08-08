package ArraysAndString;

public class CountingWordsWithaGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pref)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        CountingWordsWithaGivenPrefix cwwgp= new CountingWordsWithaGivenPrefix();
        String[] words={"leetcode","win","loops","success"};
        String pref="code";
        System.out.println(cwwgp.prefixCount(words,pref));
    }
}
