package AllAndExtras;

public class minSwaps {
    public int minSwaps(String s) {
        int ans=0;
        int j=(s.length()/2)+1;
        for(int i=0;i<j-2;i++){
            if(( (s.charAt(i)==']' && s.charAt(j)=='[') || (s.charAt(i)=='}' && s.charAt(j)=='{')
                    || ( (s.charAt(i)==']' && s.charAt(s.length()-1)=='[') || (s.charAt(i)=='}' && s.charAt(s.length()-1)=='{')))){
                ans= ans+1;
            }
        }
        return ans;
    }
    /*public int maximumSwap(int num) {//2736
        String s = String.valueOf(num);
        int answer=Integer.parseInt(String.valueOf(s.charAt(0)));
        int index=0;
        for(int i=1;i<s.length();i++){
            if(Integer.parseInt(String.valueOf(s.charAt(i)))>=answer){
                answer=Math.max(answer,Integer.parseInt(String.valueOf(s.charAt(i))));
                index=i;
            }else if(index==0){
                return num;
            }
        }
        return swap(0,index,s);
    }
    public int swap(int a, int b, String s){
        char[] array= s.toCharArray();

        char temp=array[a];
        array[a]=array[b];
        array[b]=temp;
        *//*int temp1=Integer.parseInt(String.valueOf(s.charAt(a)));
        int temp2=Integer.parseInt(String.valueOf(s.charAt(b)));
        int temp=temp1;
        temp1=temp2;
        temp2=temp;*//*
        String text = String.valueOf(array);
        return Integer.parseInt(String.valueOf(text));
    }
*/
    public int swappings(int num){
        int number=0;
        char[] chars = Integer.toString(num).toCharArray();

        for(int i=0;i<chars.length;i++){
            int index=i;

            for(int j=chars.length-1;j>i;j--){
                if(chars[index]<chars[j]){
                    index=j;
                }
            }
            if(index!=i && chars[i]<chars[index]){
                char temp=chars[i];
                chars[i]=chars[index];
                chars[index]=temp;
                number=Integer.parseInt(new String(chars));
            }
        }
        return number;
    }
    /*public int maxUniqueSplit(String s) {
        Map<Character,Integer> map = new HashMap<>();
        char[] chars=s.toCharArray();

        for(int i=0;i<chars.length;i++){

            if(map.containsKey(chars[i])){
                map.put()
            }

            if(!map.containsKey(chars[i])){
                map.put(chars[i],1);
            }
        }
    }*/
}
