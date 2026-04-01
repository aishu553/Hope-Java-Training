class Solution {
    public boolean canAliceWin(int[] nums) {
        int g=0;
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9) s+=nums[i];
            else g+=nums[i];
        }
        return g!=s;
    }
}