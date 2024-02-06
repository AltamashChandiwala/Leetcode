class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int num = 0;
        for(int i=0; i<nums.length; i+=2)
        {
            ans[i] = nums[num];
            ans[i+1] = nums[n+num];
            num++;
        }
        return ans;
    }
}