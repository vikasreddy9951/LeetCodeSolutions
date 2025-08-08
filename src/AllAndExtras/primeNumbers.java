package AllAndExtras;

import java.util.Arrays;

public class primeNumbers {
    public static void countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        char[][] array=new char[m][n];

        for(int[] guard: guards) {
            int row=guard[0];
            int col=guard[1];
            array[row][col]='G';
        }
        for(int[] wall:walls){
            int row=wall[0];
            int col=wall[1];
            array[row][col]='W';
        }
        for(int[] guard:guards){
            int row=guard[0];
            int col=guard[1];
            //traversing down
            for(int i=row+1;i<m;i++){
                if(array[i][col]=='G' || array[i][col]=='W')break;
                array[i][col]='g';
            }
            //traversing up
            for(int i=row-1;i>=0;i--){
                if(array[i][col]=='G' || array[i][col]=='W')break;
                array[i][col]='g';
            }
            //right
            for(int i=col+1;i<n;i++){
                if(array[row][i]=='G' || array[row][i]=='W')break;
                array[row][i]='g';
            }
            //left
            for(int i=col-1;i>=0;i--){
                if(array[row][i]=='G' || array[row][i]=='W')break;
                array[row][i]='g';
            }
        }
        System.out.print(Arrays.deepToString(array));
        int unguarded=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(array[i][j]==0){
                    unguarded++;
                }
            }
        }
        System.out.println(unguarded);
    }
    public static void main(String[] args) {
        int m = 4;
        int n = 6;
        int[][] guards ={{0,0},{1,1},{2,3}};
        int[][] walls={{0,1},{2,2},{1,4}};
        /*org.example.PrimeNumbers.countUnguarded(m,n,guards,walls);*/
    }
}
