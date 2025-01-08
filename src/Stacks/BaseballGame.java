package Stacks;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] operations) {
        int sum=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("x")){
                stack.removeAllElements();
            }
            else if(operations[i].equals("+")){
                int n=stack.size();
                int newScore=stack.get(n-1)+stack.get(n-2);
                stack.push(newScore);
            }
            else if(operations[i].equals("D")){
                int n2=stack.size();
                int newScore2=stack.get(n2-1)*2;
                stack.push(newScore2);
            }
            else if(operations[i].equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.valueOf(operations[i]));
            }
        }
        for(int i=0;i<stack.size();i++){
            sum=sum+stack.get(i);
        }
        return sum;
    }
    public static void main(String[] args){
        BaseballGame bbg= new BaseballGame();
        String[] op={"5","2","C","D","+"};
        System.out.println(bbg.calPoints(op));
    }
}
