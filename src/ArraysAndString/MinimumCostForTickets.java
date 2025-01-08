package ArraysAndString;

public class MinimumCostForTickets {
    public int mcft(int[] traveldays,int[]costs) {
        int day1=costs[0];
        int day7=costs[1];
        int day30=costs[2];
        int sum=0;
        int firstIndex=0;
        int secondIndex=0;
        for(int i=0;i< traveldays.length;i++){
            sum=sum+day1;
            if(traveldays[i]-traveldays[firstIndex] +1==7) {
                sum = Math.min(sum,day7);
                firstIndex=i;
            }
            if(traveldays[i]-traveldays[firstIndex] +1>7&&
            traveldays[i]-traveldays[secondIndex] +1<=30){
                sum=Math.min(sum,day30);
                secondIndex=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        MinimumCostForTickets mcft= new MinimumCostForTickets();
        int[] traveldays={1,4,6,9,10,11,12,13,14,15,16,17,18,20,21,22,23,27,28};
        int[] costs={3,13,45};
        System.out.println(mcft.mcft(traveldays,costs));
    }
}
