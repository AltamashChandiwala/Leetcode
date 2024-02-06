class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        int total = 0;
        for (int i=0; i<nums.length;i++){
            total = total + nums[i];
            sum[i] = total;
        }
        return sum;
    }
}