class Solution {
    public int maxProfit(int[] prices) {
        int minprof=prices[0],prof=0,maxprof=0;
        for(int i=0;i<prices.length;i++){
            minprof=Math.min(prices[i],minprof);
            prof=prices[i]-minprof;
            if(prof>maxprof){
                maxprof=prof;
            }
        }
        return maxprof;
    }
}