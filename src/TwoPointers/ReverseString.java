package TwoPointers;

import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {
        int head=0;
        int tail=s.length-1;
        for(int i=0;i<=tail;i++){
            char temp=s[i];
            s[i]=s[tail];
            s[tail]=temp;
            tail--;
        }
        System.out.println(s);
    }
    public static void main(String[] args){
        ReverseString rs= new ReverseString();
        char[] s={'h','e','l','l','o'};
        rs.reverseString(s);
    }
}
