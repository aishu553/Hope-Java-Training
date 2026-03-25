class Solution {
    public int numWaterBottles(int numBot, int numEx) {
        int tot=numBot;
        while(numBot>=numEx){
            int newbot=numBot/numEx;
            int rembot=numBot%numEx;
            tot+=newbot;
            numBot=newbot+rembot;
        }
        return tot;
    }
}