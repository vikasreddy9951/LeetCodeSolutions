package ArraysAndString;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Multithreading extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
            }
        }
    }
    public int countPalindromicSubsequence(String s) {
        int count=0;
        StringBuilder sb= new StringBuilder();
        sb.append(s.charAt(0));
        int i=1;
        while(i<s.length()){
            if(sb.charAt(i-1)==s.charAt(i+1)){
                count++;
                i=i+2;
            }else {
                sb.deleteCharAt(i-1);
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Multithreading mt= new Multithreading();
        /*Thread thread= new Thread(mt);
        thread.start();
        Thread thread1= new Thread(mt);
        thread1.start();
        int arr[]={2,4,8,1,2,7,2,9,3,6,5};*/
        System.out.println(mt.countPalindromicSubsequence("aabca"));
    }
}
