package ArraysAndString;

public class AddingSpacestoaString {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int space=0;
        for(int i=0;i<s.length();i++){
            if(space< spaces.length && i==spaces[space]){
                sb.append(" ");
                space++;
            }sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    //hello world from mac os m4
    public static void main(String[] args){
        AddingSpacestoaString asts=new AddingSpacestoaString();
        String s="LeetcodeHelpsMeLearn";
        int[] spaces={8,13,15};
        System.out.println(asts.addSpaces(s,spaces));
    }
}
