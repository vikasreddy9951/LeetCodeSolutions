package ArraysAndString;

import java.util.HashMap;
import java.util.Map;

public class StringsRomanToIntegers {
    public int romanToInt(String s) {
        Map<Character,Integer> map =new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char[] chars=s.toCharArray();
        int answer=map.get(chars[0]);
        for(int i=1;i<chars.length;i++){
            int sum=0;
            if(map.get(chars[i])>map.get(chars[i-1])){
                sum=map.get(chars[i])-map.get(chars[i-1]);
                answer=answer-map.get(chars[i-1]);
                answer=answer+sum;
            }else{
                answer+=map.get(chars[i]);
            }
        }
        return answer;
    }
    public static void main(String[] args){
        StringsRomanToIntegers srti= new StringsRomanToIntegers();
        String string = "MCMXCIV";
        System.out.println(srti.romanToInt(string));
    }
}
