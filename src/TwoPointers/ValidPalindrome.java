package TwoPointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]","");
        str=str.toLowerCase();

        int head=0;
        int tail=str.length()-1;
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(head)==str.charAt(tail)){
                sb.append(str.charAt(i));
                head++;
                tail--;
            }
        }
        return sb.toString().equals(str);
    }
    public static void main(String[] args){
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
