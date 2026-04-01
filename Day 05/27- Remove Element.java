class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        for(int n:nums){
            if(n!=val){
                nums[c]=n;
                c++;
            }
        }
        return c;
    }
}