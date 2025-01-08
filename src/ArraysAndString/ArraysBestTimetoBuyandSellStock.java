package ArraysAndString;

public class ArraysBestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int buyprice=prices[0];
        int profit;
        if(prices.length>1){
            profit=Integer.MIN_VALUE;
        }else{
            profit=0;
        }
        for(int i=1;i<prices.length;i++){
            if(buyprice>prices[i]){
                buyprice=prices[i];
            }
            profit=Math.max(profit,prices[i]-buyprice);
        }
        return profit;
    }
    public static  void main(String[] args){
        ArraysBestTimetoBuyandSellStock btbas=new ArraysBestTimetoBuyandSellStock();
        int[] array={1};
        System.out.println(btbas.maxProfit(array));
    }
}
