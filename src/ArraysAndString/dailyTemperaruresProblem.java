package ArraysAndString;

import java.util.ArrayList;
import java.util.Arrays;

public class dailyTemperaruresProblem {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        int n = temperatures.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int temperature : temperatures) {
            list.add(temperature);
        }
        int i=0;
        int j=0;
        while(i<temperatures.length-1){
            if(i==temperatures.length-1){
                answer[i]=0;
            }
            int count=0;
            int current=list.remove(j);
            if(current< list.get(j)){
                count++;
                answer[i]=count;
                i++;
            }else{
                int loop=0;
                while(loop<list.size()){
                    if(current<list.get(loop)){
                        answer[i]=count;
                        i++;
                    }else{
                        count++;
                        loop++;
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        dailyTemperaruresProblem dtp= new dailyTemperaruresProblem();
        int[] arr={5,4,3,2,1};//values might be incorrect
        System.out.println(Arrays.toString(dtp.dailyTemperatures(arr)));
    }
}
