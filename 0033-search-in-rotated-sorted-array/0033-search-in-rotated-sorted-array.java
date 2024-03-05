class Solution {
public static int search(int[] nums, int target) {
        int peak = peak(nums);
        //if i didn't find peak
        if(peak == -1){
            return binary(nums, target, 0,nums.length-1);
        }
        //if i found peak value
        if(nums[peak] == target){
            return peak;
        }else if(target >= nums[0]){
            return binary(nums,target,0,peak-1);
        }else{
            return binary(nums, target,peak+1,nums.length-1);
        }
    }
    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int binary(int[]nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] < target){
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}