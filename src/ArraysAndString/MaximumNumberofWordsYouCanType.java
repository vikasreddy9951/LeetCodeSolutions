package ArraysAndString;

import java.util.HashSet;
import java.util.Set;

public class MaximumNumberofWordsYouCanType {
    public int canBeTypedWords(String text, String brokenLetters) {
        int result=0;
        Set<Character> set = new HashSet<>();
        for(char c:brokenLetters.toCharArray()){
            set.add(c);
        }
        boolean istrue= true;

        for(char c:text.toCharArray()){
            if(set.contains(c) && istrue){
                istrue =false;
            }else if(c==' ' && istrue){
                result++;
            }else if(c==' '){
                istrue=true;
            }
        }
        if(istrue){
            result++;
        }
        return result;
    }
    public static void main(String[] args){
        MaximumNumberofWordsYouCanType obj = new MaximumNumberofWordsYouCanType();
        System.out.println(obj.canBeTypedWords("hello world","ad"));
    }
}
